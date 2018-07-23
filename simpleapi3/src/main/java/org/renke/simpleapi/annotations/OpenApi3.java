package org.renke.simpleapi.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OpenApi3 {
  OpenApi3Version openapi();

  Info info();

  Server[] servers() default {};

  SecurityRequirement[] security() default {};

  Tag[] tags() default {};

  ExternalDocument[] externalDocs() default {};

  @Getter
  @RequiredArgsConstructor
  enum OpenApi3Version {
    VERSION_3_0_0("3.0.0"), VERSION_3_0_1("3.0.0");

    private final String version;
  }
}
