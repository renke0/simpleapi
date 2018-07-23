package org.renke.simpleapi.autoconfigure;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.renke.simpleapi.common.OperationEntry;
import org.renke.simpleapi.configuration.OpenApi3Configurer;
import org.renke.simpleapi.factory.OpenApiFactory;
import org.renke.simpleapi.mapper.ControllerMapper;
import org.renke.simpleapi.mapper.SpringRequestMethod;
import org.renke.simpleapi.spec.OpenApiSpec;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
@ComponentScan("org.renke.simpleapi.mapper")
public class SimpleApiCommonAutoConfiguration {
  private final OpenApiFactory factory;
  private final ControllerMapper controllerMapper;
  private final OpenApi3Configurer simpleApiConfiguration;

  @Bean
  OpenApiSpec configureDocumentRoot() {
    Map<OperationEntry, SpringRequestMethod> handlerMethods = controllerMapper.findHandlerMethods();
    return factory.createSpec(handlerMethods, simpleApiConfiguration);
  }
}
