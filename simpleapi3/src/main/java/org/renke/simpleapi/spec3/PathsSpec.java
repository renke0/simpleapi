package org.renke.simpleapi.spec3;

import org.renke.simpleapi.spec.ExtensibleMap;

public class PathsSpec extends ExtensibleMap<String, PathItemSpec> {
  public static ExtensibleMapBuilder<PathsSpec, String, PathItemSpec> builder() {
    return new ExtensibleMapBuilder<>(PathsSpec::new);
  }
}
