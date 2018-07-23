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
public class EncodingSpec extends Extensible {
  private String contentType;
  @Singular
  private Map<String, HeaderSpec> headers;
  private String style;
  private String explode;
  private Boolean allowReserved;
}
