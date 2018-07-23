package org.renke.simpleapi.spec3;

import java.util.Arrays;
import java.util.List;
import org.renke.simpleapi.annotations.SecurityRequirement;
import org.renke.simpleapi.spec.ExtensibleMap;

public class SecurityRequirementSpec extends ExtensibleMap<String, List<String>> {
  public static ExtensibleMapBuilder<SecurityRequirementSpec, String, List<String>> builder() {
    return new ExtensibleMapBuilder<>(SecurityRequirementSpec::new);
  }

  public static SecurityRequirementSpec fromAnnotation(SecurityRequirement annotation) {
    return SecurityRequirementSpec.builder()
        .add(annotation.name(), Arrays.asList(annotation.value()))
        .build();
  }
}
