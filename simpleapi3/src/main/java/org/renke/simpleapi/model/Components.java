package org.renke.simpleapi.model;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Components extends Extensible {
  private Map<String, Schema> schemas;
  private Map<String, Response> responses;
  private Map<String, Parameter> parameters;
  private Map<String, Example> examples;
  private Map<String, RequestBody> requestBodies;
  private Map<String, Header> headers;
  private Map<String, SecurityScheme> securitySchemes;
  private Map<String, Link> links;
  private Map<String, Callback> callbacks;
}
