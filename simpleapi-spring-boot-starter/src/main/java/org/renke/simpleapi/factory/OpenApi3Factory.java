package org.renke.simpleapi.factory;

import org.renke.simpleapi.model.OpenApi3;
import org.renke.simpleapi.model.OpenApiDocumentRoot;

public class OpenApi3Factory extends OpenApiFactory {
  @Override
  public OpenApiDocumentRoot createDocument() {
    System.out.println("SIMPLE API 3");
    return new OpenApi3();
  }
}
