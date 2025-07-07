package me.juhokim.SpringBootApplication.controller;


import me.juhokim.SpringBootApplication.domain.DifficultyLevel;
import me.juhokim.SpringBootApplication.domain.Language;
import me.juhokim.SpringBootApplication.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LanguageController {
    @Autowired
    LanguageService languageService;

    @GetMapping("/languages")
    ResponseEntity<List<Language>> getDifficultyLevel(){
        List<Language> languages = languageService.findAll();
        return ResponseEntity.ok().body(languages);
    }
}
