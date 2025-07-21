package me.juhokim.SpringBootApplication.controller;


import me.juhokim.SpringBootApplication.domain.Lesson;
import me.juhokim.SpringBootApplication.domain.LessonSection;
import me.juhokim.SpringBootApplication.service.LessonSectionService;
import me.juhokim.SpringBootApplication.service.LessonService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LessonController {
    @Autowired
    LessonService lessonService;


    // [GET] All lesson sections for each level
    @GetMapping("/difficulty-levels/{id}/lesson-section/{section_id}")
    ResponseEntity<List<Lesson>> getLessons(@PathVariable Long section_id){
        List<Lesson> lessons = lessonService.findById(section_id);
        return ResponseEntity.ok().body(lessons);
    }
}
