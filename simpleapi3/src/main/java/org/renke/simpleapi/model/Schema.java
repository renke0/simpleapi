package org.renke.simpleapi.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Schema extends Extensible {
  private String ref;
  private String title;
  private BigDecimal multipleOf;
  private BigDecimal maximum;
  private Boolean exclusiveMaximum;
  private BigDecimal minimum;
  private Boolean exclusiveMinimum;
  private Integer maxLength;
  private Integer minLength;
  private String pattern;
  private Integer maxItems;
  private Integer minItems;
  private String uniqueItems;
  private Integer maxProperties;
  private Integer minProperties;
  private Boolean required;
  private List<Object> enumValue;
  private String type;
  private Schema allOf;
  private Schema oneOf;
  private Schema anyOf;
  private Schema not;
  private Schema items;
  private Map<String, Schema> properties;
  private Object additionalProperties;
  private String description;
  private String format;
  private Object defaultValue;
  private Boolean nullable;
  private Discriminator discriminator;
  private Boolean readOnly;
  private Boolean writeOnly;
  private Xml xml;
  private ExternalDocumentation externalDocs;
  private Object example;
  private Boolean deprecated;
}
