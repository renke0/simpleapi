package org.renke.simpleapi.model;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SecurityRequirement extends ExtensibleMap<String, List<String>> {
}
