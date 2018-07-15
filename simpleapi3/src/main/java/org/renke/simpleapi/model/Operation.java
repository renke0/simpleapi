package org.renke.simpleapi.model;

import java.util.List;
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
public class Operation extends Extensible {
  private List<String> tags;
  private String summary;
  private String description;
  private ExternalDocumentation externalDocs;
  private String operationId;
  private List<Parameter> parameters;
  private RequestBody requestBody;
  private Responses responses;
  private Map<String, Callback> callbacks;
  private Boolean deprecated;
  private List<SecurityRequirement> security;
  private List<Server> servers;
}
