package org.renke.simpleapi.annotations;

public @interface Server {
  String url();

  String description() default "";

  ServerVariable[] variables() default {};
}
