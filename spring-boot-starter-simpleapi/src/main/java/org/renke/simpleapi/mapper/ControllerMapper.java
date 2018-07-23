package org.renke.simpleapi.mapper;

import static org.springframework.core.annotation.AnnotationUtils.findAnnotation;

import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.renke.simpleapi.common.OperationEntry;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Component
@RequiredArgsConstructor
public class ControllerMapper {
  private final RequestMappingHandlerMapping handlerMapping;

  public Map<OperationEntry, SpringRequestMethod> findHandlerMethods() {
    return handlerMapping.getHandlerMethods()
        .entrySet()
        .stream()
        .map(e -> e.getValue().getMethod())
        .filter(m -> m.getDeclaringClass() != BasicErrorController.class)
        .filter(m -> findAnnotation(m.getDeclaringClass(), Controller.class) != null)
        .map(SpringRequestMethod::new)
        .flatMap(m -> m.getPaths()
            .stream()
            .flatMap(p -> Arrays.stream(m.getRequestMethods())
                .map(Enum::name)
                .map(o -> new OperationEntry(o, p))
                .map(o -> new SimpleEntry<>(o, m))))
        .collect(Collectors.toMap(SimpleEntry::getKey, SimpleEntry::getValue));
  }
}
