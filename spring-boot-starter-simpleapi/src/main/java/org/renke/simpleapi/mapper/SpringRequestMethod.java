package org.renke.simpleapi.mapper;

import static org.springframework.core.annotation.AnnotatedElementUtils.getMergedAnnotationAttributes;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Data
@RequiredArgsConstructor
public class SpringRequestMethod {
  private final Method method;
  @Getter(lazy = true)
  private final List<String> paths = initPaths();
  @Getter(value = AccessLevel.PRIVATE, lazy = true)
  private final AnnotationAttributes beanRequestMapping = initBeanRequestMapping();
  @Getter(value = AccessLevel.PRIVATE, lazy = true)
  private final AnnotationAttributes methodRequestMapping = initMethodRequestMapping();

  private AnnotationAttributes initBeanRequestMapping() {
    return getMergedAnnotationAttributes(method.getDeclaringClass(), RequestMapping.class);
  }

  private AnnotationAttributes initMethodRequestMapping() {
    return getMergedAnnotationAttributes(method, RequestMapping.class);
  }

  private List<String> initPaths() {
    String[] beanPaths = asPathElements(getBeanRequestMapping().getStringArray("path"));
    String[] methodPaths = asPathElements(getMethodRequestMapping().getStringArray("path"));

    return Arrays.stream(beanPaths)
        .flatMap(bp -> Arrays.stream(methodPaths)
            .map(mp -> bp + mp))
        .collect(Collectors.toList());
  }

  private String[] asPathElements(String[] array) {
    return array.length == 0 ? new String[]{""} : array;
  }

  public RequestMethod[] getRequestMethods() {
    return (RequestMethod[]) getMethodRequestMapping().get("method");
  }

  public String[] getConsumes() {
    String[] consumes = getMethodRequestMapping().getStringArray("consumes");
    if (consumes.length == 0) {
      consumes = getBeanRequestMapping().getStringArray("consumes");
    }
    return consumes;
  }
}
