package com.example.firstspringsecurity.controllers;

import com.example.firstspringsecurity.models.User;
import com.example.firstspringsecurity.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/")
    public List<User> getAll(){
        return userService.getList();
    }

    @GetMapping("/{username}")
    public User getByUsername(@PathVariable("username") String username){
        return userService.getUser(username);
    }

    @PostMapping("/")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }


}
