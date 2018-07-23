package org.renke.simpleapi.annotations;

public @interface Tag {
  String name();

  String description() default "";

  ExternalDocument[] externalDocs() default {};
}
