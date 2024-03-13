package io.tutorial.spring.garageApp.repository;

import io.tutorial.spring.garageApp.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GarageRepository extends JpaRepository<Car, Long> {
}
