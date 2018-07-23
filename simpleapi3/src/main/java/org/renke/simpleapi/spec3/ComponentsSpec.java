package org.renke.simpleapi.spec3;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Singular;
import org.renke.simpleapi.spec.Extensible;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ComponentsSpec extends Extensible {
  @Singular
  private Map<String, SchemaSpec> schemas;
  @Singular
  private Map<String, ResponseSpec> responses;
  @Singular
  private Map<String, ParameterSpec> parameters;
  @Singular
  private Map<String, ExampleSpec> examples;
  @Singular
  private Map<String, RequestBodySpec> requestBodies;
  @Singular
  private Map<String, HeaderSpec> headers;
  @Singular
  private Map<String, SecuritySchemeSpec> securitySchemes;
  @Singular
  private Map<String, LinkSpec> links;
  @Singular
  private Map<String, CallbackSpec> callbacks;
}
