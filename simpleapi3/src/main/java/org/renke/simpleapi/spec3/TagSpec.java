package org.renke.simpleapi.spec3;

import static com.google.common.base.Strings.emptyToNull;

import java.util.Arrays;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.renke.simpleapi.annotations.Tag;
import org.renke.simpleapi.spec.Extensible;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TagSpec extends Extensible {
  private String name;
  private String description;
  private ExternalDocumentationSpec externalDocs;

  public static TagSpec fromAnnotation(Tag annotation) {
    return builder()
        .name(emptyToNull(annotation.name()))
        .description(emptyToNull(annotation.description()))
        .externalDocs(
            Arrays.stream(annotation.externalDocs())
                .map(ExternalDocumentationSpec::fromAnnotation)
                .findFirst()
                .orElse(null))
        .build();
  }
}
