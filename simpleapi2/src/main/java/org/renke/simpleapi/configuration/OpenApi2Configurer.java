package org.renke.simpleapi.configuration;

import java.util.ArrayList;
import java.util.List;
import org.renke.simpleapi.spec2.ExternalDocumentationSpec;
import org.renke.simpleapi.spec2.InfoSpec;
import org.renke.simpleapi.spec2.OpenApi2;
import org.renke.simpleapi.spec2.SecurityDefinitionsSpec;
import org.renke.simpleapi.spec2.SecurityRequirementSpec;
import org.renke.simpleapi.spec2.TagSpec;

public interface OpenApi2Configurer extends OpenApiConfigurer<OpenApi2> {
  InfoSpec info();

  default String host() {
    return null;
  }

  default String basePath() {
    return null;
  }

  default List<String> schemes() {
    return new ArrayList<>();
  }

  default List<String> consumes() {
    return new ArrayList<>();
  }

  default List<String> produces() {
    return new ArrayList<>();
  }

  default SecurityDefinitionsSpec securityDefinitions() {
    return null;
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
  default OpenApi2 build() {
    return OpenApi2.builder()
        .info(info())
        .host(host())
        .basePath(basePath())
        .schemes(schemes())
        .consumes(consumes())
        .produces(produces())
        .securityDefinitions(securityDefinitions())
        .security(security())
        .tags(tags())
        .externalDocs(externalDocs())
        .build();
  }
}
