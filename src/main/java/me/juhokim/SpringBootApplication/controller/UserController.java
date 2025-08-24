package me.juhokim.SpringBootApplication.controller;

import me.juhokim.SpringBootApplication.domain.User;
import me.juhokim.SpringBootApplication.dto.UserRequest;
import me.juhokim.SpringBootApplication.dto.UserResponse;
import me.juhokim.SpringBootApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    // [GET] Get List of all users
    @GetMapping("/users")
    ResponseEntity<List<User>> getUsers(){
        List<User> users = userService.findAll();
        return ResponseEntity.ok().body(users);
    }


    // [GET] Get individual user information
    @GetMapping("/users/{userId}")
    ResponseEntity<User> getUser(@PathVariable long userId){
        User user = userService.findById(userId);
        return ResponseEntity.ok().body(user);
    }


    // [POST] Create a new user (Signup)
    @PostMapping("/sync")
    ResponseEntity<User> createUser(@RequestBody UserRequest dto){
        User user = userService.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }



    // [POST] Authenticate user (login)
    @PostMapping("/login")
    ResponseEntity<UserResponse> authenticateUser(@RequestBody UserRequest dto){
        UserResponse response = userService.authenticateWithToken(dto);

        return ResponseEntity.ok(response);
    }
}
