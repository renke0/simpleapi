package org.renke.simpleapi.spec3;

import static com.google.common.base.Strings.emptyToNull;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Singular;
import org.renke.simpleapi.annotations.Server;
import org.renke.simpleapi.annotations.ServerVariable;
import org.renke.simpleapi.spec.Extensible;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ServerSpec extends Extensible {
  private String url;
  private String description;
  @Singular
  private Map<String, ServerVariableSpec> variables;

  public static ServerSpec fromAnnotation(Server annotation) {
    return builder()
        .url(emptyToNull(annotation.url()))
        .description(emptyToNull(annotation.description()))
        .variables(
            Arrays.stream(annotation.variables())
                .collect(Collectors.toMap(ServerVariable::key, ServerVariableSpec::fromAnnotation)))
        .build();
  }
}
