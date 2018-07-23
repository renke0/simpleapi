package org.renke.simpleapi.spec3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.renke.simpleapi.spec.Extensible;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SecuritySchemeSpec extends Extensible {
  private String type;
  private String description;
  private String name;
  private String in;
  private String scheme;
  private String bearerFormat;
  private OAuthFlows flows;
  private String openIdConnectUrl;
}
