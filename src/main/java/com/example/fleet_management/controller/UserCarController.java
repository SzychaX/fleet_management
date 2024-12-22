package com.example.fleet_management.controller;

import com.example.fleet_management.Model.UserCar;
import com.example.fleet_management.repository.UserCarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/userCar")
public class UserCarController {
    public final UserCarRepository userCarRepository;

    public UserCarController(UserCarRepository userCarRepository)
    {
        this.userCarRepository = userCarRepository;
    }

    @GetMapping
    public List<UserCar> getAllUserCar(){
        return userCarRepository.findAll();
    }

    @PostMapping
    public UserCar createUserCar(@RequestBody UserCar userCar){
        return userCarRepository.save(userCar);
    }
}
