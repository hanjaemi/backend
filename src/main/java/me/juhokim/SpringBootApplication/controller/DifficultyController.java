package me.juhokim.SpringBootApplication.controller;


import me.juhokim.SpringBootApplication.domain.Difficulty;
import me.juhokim.SpringBootApplication.service.DifficultyLevelService;
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
    ResponseEntity<List<Difficulty>> getDifficultyLevel(){
        List<Difficulty> difficultyLevels = difficultyLevelService.findAll();
        return ResponseEntity.ok().body(difficultyLevels);
    }
}
