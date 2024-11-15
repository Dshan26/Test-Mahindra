package com.camilosandoval.techinal.test.mahinda.question3.controller;

import com.camilosandoval.techinal.test.mahinda.question3.entity.Cars;
import com.camilosandoval.techinal.test.mahinda.question3.service.CarsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/cars")
public class CarsController {

  //TODO: The explanation is in the README.md file


  private final CarsService carsService;

  public CarsController(CarsService carsService) {
    this.carsService = carsService;
  }


  @PostMapping
  public ResponseEntity<Cars> addCart(@RequestBody Cars cart) {
    return ResponseEntity.ok(carsService.addCart(cart));
  }

  @GetMapping("/{id}")
  public ResponseEntity<Cars> getCartById(@PathVariable Long id) {
    if (carsService.getCartById(id) == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(carsService.getCartById(id));
  }
}
