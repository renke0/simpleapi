package org.renke.simpleapi.spec3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.renke.simpleapi.spec.ExtensibleMap;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ResponsesSpec extends ExtensibleMap<String, ResponseSpec> {
  private ResponseSpec defaultValue;

  public static ExtensibleMapBuilder<ResponsesSpec, String, ResponseSpec> builder() {
    return new ExtensibleMapBuilder<>(ResponsesSpec::new);
  }
}
