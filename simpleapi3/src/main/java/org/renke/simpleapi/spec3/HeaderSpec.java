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
public class HeaderSpec extends Extensible {
  private String description;
  private Boolean required;
  private Boolean deprecated;
  private Boolean allowEmptyValue;
  private String style;
  private Boolean explode;
  private Boolean allowReserved;
  private SchemaSpec schema;
  private Object example;
  @Singular
  private Map<String, ExampleSpec> examples;
  @Singular("content")
  private Map<String, MediaTypeSpec> content;
}
