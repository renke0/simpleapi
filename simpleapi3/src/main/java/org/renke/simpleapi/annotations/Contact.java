package org.renke.simpleapi.annotations;

public @interface Contact {
  String name() default "";

  String url() default "";

  String email() default "";
}
