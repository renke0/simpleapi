package org.renke.simpleapi.factory;

import org.renke.simpleapi.model.OpenApiDocumentRoot;

public abstract class OpenApiFactory {
  public abstract OpenApiDocumentRoot createDocument();
}
