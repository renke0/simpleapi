package org.renke.simpleapi.factory;

import static com.google.common.base.Preconditions.checkArgument;

import java.util.Map;
import org.renke.simpleapi.common.OperationEntry;
import org.renke.simpleapi.configuration.OpenApi3Configurer;
import org.renke.simpleapi.configuration.OpenApiConfigurer;
import org.renke.simpleapi.mapper.SpringRequestMethod;
import org.renke.simpleapi.spec.OpenApiSpec;

public class OpenApi3Factory extends OpenApiFactory {
  @Override
  public OpenApiSpec createSpec(
      Map<OperationEntry, SpringRequestMethod> handlerMethods,
      OpenApiConfigurer apiConfigurer) {
    checkArgument(apiConfigurer instanceof OpenApi3Configurer,
        "Cannot create spec for Open API version 3 with %s",
        apiConfigurer.getClass().getSimpleName());

    return apiConfigurer.build();
  }
}
