package com.example.fleet_management.repository;

import com.example.fleet_management.Model.UserCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCarRepository extends JpaRepository<UserCar, Long> {
}
