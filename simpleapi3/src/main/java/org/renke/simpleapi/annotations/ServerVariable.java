package org.renke.simpleapi.annotations;

public @interface ServerVariable {
  String key();

  String[] enumValue() default {};

  String defaultValue();

  String description() default "";
}
