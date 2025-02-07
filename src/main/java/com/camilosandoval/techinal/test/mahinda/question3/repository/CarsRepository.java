package com.camilosandoval.techinal.test.mahinda.question3.repository;

import com.camilosandoval.techinal.test.mahinda.question3.entity.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends JpaRepository<Cars, Long> {
}