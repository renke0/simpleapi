package org.renke.simpleapi.autoconfigure;

import org.renke.simpleapi.factory.OpenApi3Factory;
import org.renke.simpleapi.factory.OpenApiFactory;
import org.renke.simpleapi.spec3.OpenApi3Spec;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(OpenApi3Spec.class)
public class SimpleApi3AutoConfiguration {
  @Bean
  @ConditionalOnMissingBean
  OpenApiFactory configureOpenApi() {
    return new OpenApi3Factory();
  }
}
