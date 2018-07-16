package org.renke.simpleapi.mapper;

import static org.springframework.core.annotation.AnnotationUtils.findAnnotation;

import com.google.common.collect.Multimap;
import java.lang.reflect.Method;
import lombok.RequiredArgsConstructor;
import org.renke.simpleapi.common.MultimapCollector;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Component
@RequiredArgsConstructor
public class ControllerMapper {
  private final RequestMappingHandlerMapping handlerMapping;

  public Multimap<Class<?>, Method> findHandlers() {
    return handlerMapping.getHandlerMethods()
        .entrySet()
        .stream()
        .map(e -> e.getValue().getMethod())
        .filter(m -> m.getDeclaringClass() != BasicErrorController.class)
        .filter(m -> findAnnotation(m.getDeclaringClass(), Controller.class) != null)
        .collect(MultimapCollector.toMultimap(Method::getDeclaringClass));
  }
}
