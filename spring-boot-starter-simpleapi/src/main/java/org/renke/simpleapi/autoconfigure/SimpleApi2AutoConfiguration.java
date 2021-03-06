package org.renke.simpleapi.autoconfigure;

import org.renke.simpleapi.factory.OpenApi2Factory;
import org.renke.simpleapi.factory.OpenApiFactory;
import org.renke.simpleapi.spec2.OpenApi2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(OpenApi2.class)
public class SimpleApi2AutoConfiguration {
  @Bean
  @ConditionalOnMissingBean
  OpenApiFactory configureOpenApi() {
    return new OpenApi2Factory();
  }
}
