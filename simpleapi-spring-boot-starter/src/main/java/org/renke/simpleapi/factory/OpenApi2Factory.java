package org.renke.simpleapi.factory;

import org.renke.simpleapi.model.OpenApi2;
import org.renke.simpleapi.model.OpenApiDocumentRoot;

public class OpenApi2Factory extends OpenApiFactory {
  @Override
  public OpenApiDocumentRoot createDocument() {
    System.out.println("SIMPLE API 2");
    return new OpenApi2();
  }
}
