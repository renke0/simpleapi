package org.renke.simpleapi.spec3;

import static com.google.common.base.Strings.emptyToNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.renke.simpleapi.annotations.Contact;
import org.renke.simpleapi.spec.Extensible;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ContactSpec extends Extensible {
  private String name;
  private String url;
  private String email;

  public static ContactSpec fromAnnotation(Contact annotation) {
    return builder()
        .name(emptyToNull(annotation.name()))
        .url(emptyToNull(annotation.url()))
        .email(emptyToNull(annotation.email()))
        .build();
  }
}
