package org.renke.simpleapi.annotations;

public @interface ExternalDocument {
  String description() default "";

  String url();
}
