package com.example.fleet_management.repository;

import com.example.fleet_management.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
