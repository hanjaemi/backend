package me.juhokim.SpringBootApplication.controller;

import me.juhokim.SpringBootApplication.domain.Word;
import me.juhokim.SpringBootApplication.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WordController {
    @Autowired
    WordService wordService;

    @GetMapping("/words")
    ResponseEntity<List<Word>> getWords(){
        List<Word> words = wordService.findAll();
        return ResponseEntity.ok().body(words);
    }
}
