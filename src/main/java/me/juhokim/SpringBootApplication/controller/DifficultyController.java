package me.juhokim.SpringBootApplication.controller;


import io.swagger.v3.oas.annotations.tags.Tag;
import me.juhokim.SpringBootApplication.domain.Difficulty;
import me.juhokim.SpringBootApplication.service.DifficultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Difficulty API", description = "Operation related to lesson difficulty")
public class DifficultyController {
    @Autowired
    DifficultyService difficultyLevelService;

    // [GET] Show difficulty Levels
    @GetMapping("/difficulty")
    ResponseEntity<List<Difficulty>> getDifficultyLevel(){
        List<Difficulty> difficultyLevels = difficultyLevelService.findAll();
        return ResponseEntity.ok().body(difficultyLevels);
    }
}
