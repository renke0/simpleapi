package org.renke.simpleapi.spec3;

import java.math.BigDecimal;
import java.util.List;
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
public class SchemaSpec extends Extensible {
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
  @Singular("enumValue")
  private List<Object> enumValue;
  private String type;
  private SchemaSpec allOf;
  private SchemaSpec oneOf;
  private SchemaSpec anyOf;
  private SchemaSpec not;
  private SchemaSpec items;
  @Singular
  private Map<String, SchemaSpec> properties;
  private Object additionalProperties;
  private String description;
  private String format;
  private Object defaultValue;
  private Boolean nullable;
  private DiscriminatorSpec discriminator;
  private Boolean readOnly;
  private Boolean writeOnly;
  private XmlSpec xml;
  private ExternalDocumentationSpec externalDocs;
  private Object example;
  private Boolean deprecated;
}
