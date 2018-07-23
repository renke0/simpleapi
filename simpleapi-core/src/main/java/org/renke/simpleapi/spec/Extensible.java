package org.renke.simpleapi.spec;

import static java.util.Objects.requireNonNull;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.renke.simpleapi.OpenApiException;

public abstract class Extensible {
  private final Map<String, Object> extensions = new HashMap<>();

  public Object addExtension(String name, Object value) {
    return extensions.put(toExtensionName(name), value);
  }

  public Object removeExtension(String name) {
    return extensions.remove(toExtensionName(name));
  }

  public Object extension(String name) {
    return extensions.get(toExtensionName(name));
  }

  public <T> T extension(String name, Class<T> type) {
    Object extension = extension(name);
    if (extension != null && !type.isAssignableFrom(extension.getClass())) {
      throw new OpenApiException(
          "Property %s is not a %s",
          toExtensionName(name),
          type.getSimpleName());
    }
    return extension == null ? null : type.cast(extension);
  }

  public Map<String, Object> extensions() {
    return Collections.unmodifiableMap(extensions);
  }

  private String toExtensionName(String name) {
    return requireNonNull(name, "The property name cannot be null")
        .matches("^x-.+") ? name : "x-" + name;
  }
}
