package me.juhokim.SpringBootApplication.controller;

import me.juhokim.SpringBootApplication.domain.Grammar;
import me.juhokim.SpringBootApplication.service.GrammarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GrammarController {
    @Autowired
    GrammarService grammarService;

    // [GET] Get grammars
    @GetMapping("/difficulty/{id}/lessons/{section_id}/grammar/{lesson_id}")
    ResponseEntity<List<Grammar>> getUser(@PathVariable Long lesson_id){
        List<Grammar> grammars = grammarService.findByLessonId(lesson_id);
        return ResponseEntity.ok().body(grammars);
    }
}
