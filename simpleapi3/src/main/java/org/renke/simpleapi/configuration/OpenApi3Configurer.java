package org.renke.simpleapi.configuration;

import java.util.ArrayList;
import java.util.List;
import org.renke.simpleapi.spec3.ComponentsSpec;
import org.renke.simpleapi.spec3.ExternalDocumentationSpec;
import org.renke.simpleapi.spec3.InfoSpec;
import org.renke.simpleapi.spec3.OpenApi3Spec;
import org.renke.simpleapi.spec3.PathsSpec;
import org.renke.simpleapi.spec3.SecurityRequirementSpec;
import org.renke.simpleapi.spec3.ServerSpec;
import org.renke.simpleapi.spec3.TagSpec;

public interface OpenApi3Configurer extends OpenApiConfigurer<OpenApi3Spec> {
  InfoSpec info();

  default List<ServerSpec> servers() {
    return new ArrayList<>();
  }

  default List<SecurityRequirementSpec> security() {
    return new ArrayList<>();
  }

  default List<TagSpec> tags() {
    return new ArrayList<>();
  }

  default ExternalDocumentationSpec externalDocs() {
    return null;
  }

  @Override
  default OpenApi3Spec build() {
    return OpenApi3Spec.builder()
        .openapi(apiVersion())
        .info(info())
        .servers(servers())
        .paths(new PathsSpec())
        .components(new ComponentsSpec())
        .security(security())
        .tags(tags())
        .externalDocs(externalDocs())
        .build();
  }
}
