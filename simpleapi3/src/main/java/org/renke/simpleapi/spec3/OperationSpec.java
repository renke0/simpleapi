package org.renke.simpleapi.spec3;

import java.util.List;
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
public class OperationSpec extends Extensible {
  private List<String> tags;
  private String summary;
  private String description;
  private ExternalDocumentationSpec externalDocs;
  private String operationId;
  @Singular
  private List<ParameterSpec> parameters;
  private RequestBodySpec requestBody;
  private ResponsesSpec responses;
  @Singular
  private Map<String, CallbackSpec> callbacks;
  private Boolean deprecated;
  @Singular("security")
  private List<SecurityRequirementSpec> security;
  @Singular
  private List<ServerSpec> servers;
}
