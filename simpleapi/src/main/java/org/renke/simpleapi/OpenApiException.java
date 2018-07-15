package org.renke.simpleapi;

public class OpenApiException extends RuntimeException {
  public OpenApiException(String message, Object... parameters) {
    super(String.format(message, parameters));
  }
}
