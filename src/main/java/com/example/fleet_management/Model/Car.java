package com.example.fleet_management.Model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Schema(description = "Brand of the car")
    private String brand;

    @Schema(description = "Model of the car")
    private String model;

    @Schema(description = "Registration number of the car")
    private String registrationNumber;

    @Schema(description = "Year of production of the car")
    private int yearOfProduction;

    @Schema(description = "Mileage of the car")
    private int mileage;
}
