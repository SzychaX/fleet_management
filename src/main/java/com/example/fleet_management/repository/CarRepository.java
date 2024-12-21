package com.example.fleet_management.repository;

import com.example.fleet_management.Model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
