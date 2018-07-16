package org.renke.openapidemo.controller;

import lombok.RequiredArgsConstructor;
import org.renke.simpleapi.factory.OpenApiFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class DemoController {
  private final OpenApiFactory factory;

  @GetMapping
  public String hi() {
    return "hi";
  }
}
