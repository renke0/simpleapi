package org.renke.simpleapi.factory;

import java.util.Map;
import org.renke.simpleapi.common.OperationEntry;
import org.renke.simpleapi.configuration.OpenApiConfigurer;
import org.renke.simpleapi.mapper.SpringRequestMethod;
import org.renke.simpleapi.spec.OpenApiSpec;

public class OpenApi2Factory extends OpenApiFactory {
  @Override
  public OpenApiSpec createSpec(
      Map<OperationEntry, SpringRequestMethod> handlerMethods,
      OpenApiConfigurer apiConfigurer) {
    return null;
  }
}
