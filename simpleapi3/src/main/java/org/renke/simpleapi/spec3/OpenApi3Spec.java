package org.renke.simpleapi.spec3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Singular;
import org.renke.simpleapi.annotations.OpenApi3;
import org.renke.simpleapi.spec.Extensible;
import org.renke.simpleapi.spec.OpenApiSpec;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class OpenApi3Spec extends Extensible implements OpenApiSpec {
  private String openapi;
  private InfoSpec info;
  @Singular
  private List<ServerSpec> servers;
  private PathsSpec paths;
  private ComponentsSpec components;
  @Singular("security")
  private List<SecurityRequirementSpec> security;
  @Singular
  private List<TagSpec> tags;
  private ExternalDocumentationSpec externalDocs;

  public static OpenApi3Spec fromAnnotation(OpenApi3 annotation) {
    return builder()
        .openapi(annotation.openapi().getVersion())
        .info(InfoSpec.fromAnnotation(annotation.info()))
        .servers(
            Arrays.stream(annotation.servers())
                .map(ServerSpec::fromAnnotation)
                .collect(Collectors.toList()))
        .security(
            Arrays.stream(annotation.security())
                .map(SecurityRequirementSpec::fromAnnotation)
                .collect(Collectors.toList()))
        .tags(
            Arrays.stream(annotation.tags())
                .map(TagSpec::fromAnnotation)
                .collect(Collectors.toList()))
        .externalDocs(
            Arrays.stream(annotation.externalDocs())
                .map(ExternalDocumentationSpec::fromAnnotation)
                .findFirst()
                .orElse(null))
        .build();
  }
}
