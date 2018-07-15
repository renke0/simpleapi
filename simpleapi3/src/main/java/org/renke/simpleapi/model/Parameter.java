package org.renke.simpleapi.model;

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
public class Parameter extends Extensible {
  private String name;
  private String in;
  private String description;
  private Boolean required;
  private Boolean deprecated;
  private Boolean allowEmptyValue;
  private String style;
  private Boolean explode;
  private Boolean allowReserved;
  private Schema schema;
  private Object example;
  private Map<String, Example> examples;
  private Map<String, MediaType> content;
}
