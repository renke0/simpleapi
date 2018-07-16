package org.renke.simpleapi.model;

import java.util.List;
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
public class OpenApi3 extends Extensible implements OpenApiDocumentRoot {
  private String openapi;
  private Info info;
  private List<Server> servers;
  private Paths paths;
  private Components components;
  private List<SecurityRequirement> security;
  private List<Tag> tags;
  private ExternalDocumentation externalDocs;
}
