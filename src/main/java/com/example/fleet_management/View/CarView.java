package com.example.fleet_management.View;

import com.example.fleet_management.Model.Car;
import com.example.fleet_management.repository.CarRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CarView {

    private final CarRepository carRepository;

    public CarView(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    @GetMapping("/cars")
    public String getCarsPage(Model model){
        List<Car> cars = carRepository.findAll();
        model.addAttribute("cars", cars);
        return "cars";
    }
    @GetMapping("/cars/add")
    public String showAddCarForm(Model model) {
        model.addAttribute("car", new Car());
        return "add-car";
    }
    @PostMapping("/cars/add")
    public String addCar(@ModelAttribute Car car) {
        carRepository.save(car);
        return "redirect:/cars"; // Przekierowanie na stronę z listą samochodów
    }
}
