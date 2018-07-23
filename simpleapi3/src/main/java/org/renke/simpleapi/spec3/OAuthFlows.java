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
public class OAuthFlows extends Extensible {
  private OAuthFlowSpec implicit;
  private OAuthFlowSpec password;
  private OAuthFlowSpec clientCredentials;
  private OAuthFlowSpec authorizationCode;
}
