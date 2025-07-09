package me.juhokim.SpringBootApplication.controller;


import me.juhokim.SpringBootApplication.domain.LessonSection;
import me.juhokim.SpringBootApplication.service.LessonSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LessonSectionController {

    @Autowired
    LessonSectionService lessonSectionService;

    // All lesson sections for each level
    @GetMapping("/difficulty-levels/{id}/lesson-section")
    ResponseEntity<List<LessonSection>> getLessons(@PathVariable Integer id){
        List<LessonSection> lessons = lessonSectionService.findById(id);
        return ResponseEntity.ok().body(lessons);
    }
}
