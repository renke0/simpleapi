package org.renke.simpleapi.spec3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.renke.simpleapi.spec.Extensible;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class XmlSpec extends Extensible {
  private String name;
  private String namespace;
  private String prefix;
  private Boolean attribute;
  private Boolean wrapped;
}
