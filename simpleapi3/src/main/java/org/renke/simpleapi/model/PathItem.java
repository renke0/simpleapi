package org.renke.simpleapi.model;

import java.util.List;
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
public class PathItem extends Extensible {
  private String ref;
  private String summary;
  private String description;
  private Operation get;
  private Operation post;
  private Operation put;
  private Operation delete;
  private Operation options;
  private Operation head;
  private Operation patch;
  private Operation trace;
  private List<Server> servers;
  private List<Parameter> parameters;
}
