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
public class Response extends Extensible {
  private String description;
  private Map<String, Header> headers;
  private Map<String, MediaType> content;
  private Map<String, Link> links;
}
