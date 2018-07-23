package org.renke.simpleapi.configuration;

import org.renke.simpleapi.OpenApiException;
import org.renke.simpleapi.annotations.OpenApi3;
import org.renke.simpleapi.spec3.InfoSpec;
import org.renke.simpleapi.spec3.OpenApi3Spec;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.util.ClassUtils;

public interface OpenApi3AnnotationBasedConfigurer extends OpenApi3Configurer {
  @Override
  default OpenApi3Spec build() {
    Class configurationClass = ClassUtils.getUserClass(this.getClass());
    OpenApi3 annotation = AnnotatedElementUtils.getMergedAnnotation(
        configurationClass, OpenApi3.class);
    if (annotation == null) {
      throw new OpenApiException(
          "Could not find %s annotation on %s",
          OpenApi3.class.getSimpleName(),
          configurationClass.getName());
    }
    return OpenApi3Spec.fromAnnotation(annotation);
  }

  @Override
  default String apiVersion() {
    throw new OpenApiException("apiVersion() should not be invoked on %s instances",
        OpenApi3AnnotationBasedConfigurer.class.getSimpleName());
  }

  @Override
  default InfoSpec info() {
    throw new OpenApiException("info() should not be invoked on %s instances",
        OpenApi3AnnotationBasedConfigurer.class.getSimpleName());
  }
}
