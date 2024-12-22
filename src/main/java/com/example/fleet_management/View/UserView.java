package com.example.fleet_management.View;

import com.example.fleet_management.Model.User;
import com.example.fleet_management.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserView {
    private final UserRepository userRepository;

    public UserView(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public String getUsersPage(Model model){
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/users/add")
    public String showAddUserForm(Model model){
        model.addAttribute("user", new User());
        return "add-user";
    }
    @PostMapping("/users/add")
    public String addUser(@ModelAttribute User user){
        userRepository.save(user);
        return "redirect:/users";
    }
}
