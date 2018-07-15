package org.renke.simpleapi.model;

import java.util.Map;
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
public class Link extends Extensible {
  private String operationRef;
  private String operationId;
  private Map<String, Object> parameters;
  private Object requestBody;
  private String description;
  private Server server;
}
