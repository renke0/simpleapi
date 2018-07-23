package org.renke.simpleapi.spec3;

import static com.google.common.base.Strings.emptyToNull;

import java.util.Arrays;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.renke.simpleapi.annotations.ServerVariable;
import org.renke.simpleapi.spec.Extensible;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ServerVariableSpec extends Extensible {
  private List<String> enumValue;
  private String defaultValue;
  private String description;

  public static ServerVariableSpec fromAnnotation(ServerVariable annotation) {
    return builder()
        .enumValue(Arrays.asList(annotation.enumValue()))
        .defaultValue(emptyToNull(annotation.defaultValue()))
        .description(emptyToNull(annotation.description()))
        .build();
  }
}
