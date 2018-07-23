package org.renke.simpleapi.annotations;

public @interface SecurityRequirement {
  String name();

  String[] value() default {};
}
