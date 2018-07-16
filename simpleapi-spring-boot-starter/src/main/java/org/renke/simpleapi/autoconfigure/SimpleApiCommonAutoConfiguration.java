package org.renke.simpleapi.autoconfigure;

import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.renke.simpleapi.factory.OpenApiFactory;
import org.renke.simpleapi.mapper.ControllerMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
@ComponentScan("org.renke.simpleapi.mapper")
public class SimpleApiCommonAutoConfiguration {
  private final OpenApiFactory factory;
  private final ControllerMapper controllerMapper;

  @PostConstruct
  void init() {
    controllerMapper.findHandlers();
  }
}
