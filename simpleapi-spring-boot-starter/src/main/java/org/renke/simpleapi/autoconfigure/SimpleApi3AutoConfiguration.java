package org.renke.simpleapi.autoconfigure;

import lombok.RequiredArgsConstructor;
import org.renke.simpleapi.factory.OpenApi3Factory;
import org.renke.simpleapi.factory.OpenApiFactory;
import org.renke.simpleapi.model.OpenApi3;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(OpenApi3.class)
public class SimpleApi3AutoConfiguration {
  @Bean
  OpenApiFactory configureOpenApi() {
    return new OpenApi3Factory();
  }
}
