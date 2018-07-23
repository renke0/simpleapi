package org.renke.openapidemo.controller;

import java.util.Collections;
import java.util.List;
import org.renke.openapidemo.model.NewPet;
import org.renke.openapidemo.model.Pet;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pets")
public class PetController {

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Pet> listPets(
      @RequestParam(required = false) List<String> tags,
      @RequestParam(required = false) Integer limit) {
    return Collections.emptyList();
  }

  @PostMapping
  public Pet createPet(@RequestBody NewPet pet) {
    return null;
  }

  @GetMapping({"/{id}", "/a/{id}"})
  public Pet getPet(@PathVariable Long id) {
    return null;
  }

  @DeleteMapping("/{id}")
  public void removePet(@PathVariable Long id) {
  }
}
