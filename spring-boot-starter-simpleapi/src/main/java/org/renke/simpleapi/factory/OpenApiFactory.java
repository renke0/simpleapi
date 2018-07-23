package org.renke.simpleapi.factory;

import java.util.Map;
import org.renke.simpleapi.common.OperationEntry;
import org.renke.simpleapi.configuration.OpenApiConfigurer;
import org.renke.simpleapi.mapper.SpringRequestMethod;
import org.renke.simpleapi.spec.OpenApiSpec;

public abstract class OpenApiFactory {
  public abstract OpenApiSpec createSpec(
      Map<OperationEntry, SpringRequestMethod> handlerMethods,
      OpenApiConfigurer apiConfigurer);
}
