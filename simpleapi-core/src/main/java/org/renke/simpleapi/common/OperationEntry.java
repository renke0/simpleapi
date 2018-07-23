package org.renke.simpleapi.common;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OperationEntry {
  private String path;
  private String operation;

  @Override
  public String toString() {
    return path + " " + operation;
  }
}
