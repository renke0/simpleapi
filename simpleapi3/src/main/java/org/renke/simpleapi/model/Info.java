package org.renke.simpleapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Info {
  private String title;
  private String description;
  private String termsOfService;
  private Contact contact;
  private License license;
  private String version;
}
