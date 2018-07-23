package org.renke.simpleapi.autoconfigure;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.renke.simpleapi.annotations.ExternalDocument;
import org.renke.simpleapi.annotations.Info;
import org.renke.simpleapi.annotations.OpenApi3;
import org.renke.simpleapi.annotations.OpenApi3.OpenApi3Version;
import org.renke.simpleapi.annotations.SecurityRequirement;
import org.renke.simpleapi.annotations.Server;
import org.renke.simpleapi.annotations.Tag;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AliasFor;

/**
 * Spring based annotation for the auto-configuration of the OpenAPI 3.x documentation.
 *
 * <strong>IMPORTANT:</strong> the values from the annotation {@link OpenApi3} present in this
 * annotation are just placeholders, and WILL BE OVERRIDDEN ALWAYS
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@OpenApi3(openapi = OpenApi3Version.VERSION_3_0_0,
    info = @Info(title = "ignored", version = "ignored"))
@Configuration
public @interface EnableOpenApi3 {
  @AliasFor(annotation = OpenApi3.class, attribute = "openapi")
  OpenApi3Version openapi();

  @AliasFor(annotation = OpenApi3.class, attribute = "info")
  Info info();

  @AliasFor(annotation = OpenApi3.class, attribute = "servers")
  Server[] servers() default {};

  @AliasFor(annotation = OpenApi3.class, attribute = "security")
  SecurityRequirement[] security() default {};

  @AliasFor(annotation = OpenApi3.class, attribute = "tags")
  Tag[] tags() default {};

  @AliasFor(annotation = OpenApi3.class, attribute = "externalDocs")
  ExternalDocument[] externalDocs() default {};
}
