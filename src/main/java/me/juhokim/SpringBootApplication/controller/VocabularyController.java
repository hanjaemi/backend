package me.juhokim.SpringBootApplication.controller;

import me.juhokim.SpringBootApplication.domain.Vocabulary;
import me.juhokim.SpringBootApplication.service.VocabularyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VocabularyController {
    @Autowired
    VocabularyService vocabularyService;

    // [GET] Get grammars
    @GetMapping("/difficulty/{id}/lessons/{section_id}/vocabulary/{lesson_id}")
    ResponseEntity<List<Vocabulary>> getVocabs(@PathVariable Long lesson_id){
        List<Vocabulary> vocabularies = vocabularyService.findByLessonId(lesson_id);
        return ResponseEntity.ok().body(vocabularies);
    }
}
