package org.renke.simpleapi.spec3;

import java.util.List;
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
public class PathItemSpec extends Extensible {
  private String ref;
  private String summary;
  private String description;
  private OperationSpec get;
  private OperationSpec post;
  private OperationSpec put;
  private OperationSpec delete;
  private OperationSpec options;
  private OperationSpec head;
  private OperationSpec patch;
  private OperationSpec trace;
  @Singular
  private List<ServerSpec> servers;
  @Singular
  private List<ParameterSpec> parameters;
}
