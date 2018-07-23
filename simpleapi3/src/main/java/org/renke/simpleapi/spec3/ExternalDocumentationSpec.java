package org.renke.simpleapi.spec3;

import static com.google.common.base.Strings.emptyToNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.renke.simpleapi.annotations.ExternalDocument;
import org.renke.simpleapi.spec.Extensible;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ExternalDocumentationSpec extends Extensible {
  private String description;
  private String url;

  public static ExternalDocumentationSpec fromAnnotation(ExternalDocument annotation) {
    return builder()
        .description(emptyToNull(annotation.description()))
        .url(emptyToNull(annotation.url()))
        .build();
  }
}
