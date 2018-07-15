package org.renke.simpleapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Callback extends ExtensibleMap<String, PathItem> {
}
