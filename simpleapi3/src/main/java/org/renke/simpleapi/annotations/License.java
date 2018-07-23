package org.renke.simpleapi.annotations;

public @interface License {
  String name();

  String url() default "";
}
