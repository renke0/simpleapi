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
public class OAuthFlows extends Extensible {
  private OAuthFlow implicit;
  private OAuthFlow password;
  private OAuthFlow clientCredentials;
  private OAuthFlow authorizationCode;
}
