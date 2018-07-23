package org.renke.simpleapi.spec3;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Singular;
import org.renke.simpleapi.spec.Extensible;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class LinkSpec extends Extensible {
  private String operationRef;
  private String operationId;
  @Singular
  private Map<String, Object> parameters;
  private Object requestBody;
  private String description;
  private ServerSpec server;
}
