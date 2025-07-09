package me.juhokim.SpringBootApplication.controller;


import me.juhokim.SpringBootApplication.domain.DifficultyLevel;
import me.juhokim.SpringBootApplication.domain.User;
import me.juhokim.SpringBootApplication.repository.DifficultyLevelRepository;
import me.juhokim.SpringBootApplication.service.DifficultyLevelService;
import me.juhokim.SpringBootApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DifficultyLevelController {
    @Autowired
    DifficultyLevelService difficultyLevelService;

    // Show lessons by difficulty levels
    @GetMapping("/difficulty-levels")
    ResponseEntity<List<DifficultyLevel>> getDifficultyLevel(){
        List<DifficultyLevel> difficultyLevels = difficultyLevelService.findAll();
        return ResponseEntity.ok().body(difficultyLevels);
    }
}
