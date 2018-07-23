package org.renke.simpleapi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Info {
  String title();

  String version();

  String description() default "";

  String termsOfService() default "";

  Contact[] contact() default {};

  License[] license() default {};
}
