package org.renke.simpleapi.model;

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
public class SecurityScheme extends Extensible {
  private String type;
  private String description;
  private String name;
  private String in;
  private String scheme;
  private String bearerFormat;
  private OAuthFlows flows;
  private String openIdConnectUrl;
}
