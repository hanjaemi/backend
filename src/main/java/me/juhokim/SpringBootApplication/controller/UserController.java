package me.juhokim.SpringBootApplication.controller;

import me.juhokim.SpringBootApplication.domain.User;
import me.juhokim.SpringBootApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    ResponseEntity<List<User>> getUsers(){
        List<User> users = userService.findAll();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping("/users/{userId}")
    ResponseEntity<User> getUser(@PathVariable long userId){
        User user = userService.findById(userId);
        return ResponseEntity.ok().body(user);
    }
}
