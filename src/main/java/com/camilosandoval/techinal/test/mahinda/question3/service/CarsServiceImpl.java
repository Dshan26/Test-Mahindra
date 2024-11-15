package com.camilosandoval.techinal.test.mahinda.question3.service;

import com.camilosandoval.techinal.test.mahinda.question3.entity.Cars;
import com.camilosandoval.techinal.test.mahinda.question3.repository.CarsRepository;
import org.springframework.stereotype.Service;

@Service
public class CarsServiceImpl implements CarsService {


  private final CarsRepository cartRepository;

  public CarsServiceImpl(CarsRepository cartRepository) {
    this.cartRepository = cartRepository;
  }

  @Override
  public Cars addCart(Cars cart) {

    return cartRepository.save(cart);
  }

  @Override
  public Cars getCartById(Long id) {
    return cartRepository.findById(id).orElse(null);
  }
}
