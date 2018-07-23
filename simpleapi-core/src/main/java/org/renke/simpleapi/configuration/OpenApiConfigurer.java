package org.renke.simpleapi.configuration;

import java.util.Map;
import org.renke.simpleapi.spec.OpenApiSpec;

public interface OpenApiConfigurer<T extends OpenApiSpec> {
  String apiVersion();

  default Map<String, Object> extensions() {
    return null;
  }

  T build();
}
