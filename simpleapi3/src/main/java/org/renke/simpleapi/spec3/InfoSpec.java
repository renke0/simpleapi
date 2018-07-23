package org.renke.simpleapi.spec3;

import static com.google.common.base.Strings.emptyToNull;

import java.util.Arrays;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.renke.simpleapi.annotations.Info;
import org.renke.simpleapi.spec.Extensible;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InfoSpec extends Extensible {
  private String title;
  private String description;
  private String termsOfService;
  private ContactSpec contact;
  private LicenseSpec license;
  private String version;

  public static InfoSpec fromAnnotation(Info annotation) {
    return builder()
        .title(emptyToNull(annotation.title()))
        .version(emptyToNull(annotation.version()))
        .description(emptyToNull(annotation.description()))
        .termsOfService(emptyToNull(annotation.termsOfService()))
        .contact(
            Arrays.stream(annotation.contact())
                .map(ContactSpec::fromAnnotation)
                .findFirst()
                .orElse(null))
        .license(
            Arrays.stream(annotation.license())
                .map(LicenseSpec::fromAnnotation)
                .findFirst()
                .orElse(null))
        .build();
  }
}
