package org.renke.simpleapi.spec3;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Singular;
import org.renke.simpleapi.spec.Extensible;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class RequestBodySpec extends Extensible {
  private String description;
  @Singular("content")
  private Map<String, MediaTypeSpec> content;
  private Boolean required;
}
