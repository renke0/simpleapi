package org.renke.simpleapi.spec3;

import org.renke.simpleapi.spec.ExtensibleMap;

public class CallbackSpec extends ExtensibleMap<String, PathItemSpec> {
  public static ExtensibleMapBuilder<CallbackSpec, String, PathItemSpec> builder() {
    return new ExtensibleMapBuilder<>(CallbackSpec::new);
  }
}
