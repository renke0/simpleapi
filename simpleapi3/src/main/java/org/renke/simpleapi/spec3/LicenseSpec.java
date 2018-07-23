package org.renke.simpleapi.spec3;

import static com.google.common.base.Strings.emptyToNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.renke.simpleapi.annotations.License;
import org.renke.simpleapi.spec.Extensible;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class LicenseSpec extends Extensible {
  private String name;
  private String url;

  public static LicenseSpec fromAnnotation(License annotation) {
    return builder()
        .name(emptyToNull(annotation.name()))
        .url(emptyToNull(annotation.url()))
        .build();
  }
}
