package org.renke.simpleapi.spec2;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.renke.simpleapi.spec.OpenApiSpec;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OpenApi2 implements OpenApiSpec {
  private String swagger;
  private InfoSpec info;
  private String host;
  private String basePath;
  private List<String> schemes;
  private List<String> consumes;
  private List<String> produces;
  private PathsSpec paths;
  private DefinitionsSpec definitions;
  private ParametersSpec parameters;
  private ResponsesSpec responses;
  private SecurityDefinitionsSpec securityDefinitions;
  private List<SecurityRequirementSpec> security;
  private List<TagSpec> tags;
  private ExternalDocumentationSpec externalDocs;
}
