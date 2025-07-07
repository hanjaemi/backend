package me.juhokim.SpringBootApplication.controller;


import me.juhokim.SpringBootApplication.domain.Lesson;
import me.juhokim.SpringBootApplication.service.LessonService;
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


    // Return list of all lessons
    @GetMapping("/lessons")
    ResponseEntity<List<Lesson>> getAllLessons(){
        List<Lesson> lessons = lessonService.findAll();
        return ResponseEntity.ok().body(lessons);
    }

    // Return lesson for each level
    @GetMapping("/lessons/{id}")
    ResponseEntity<List<Lesson>> getLessons(@PathVariable Integer id){
        List<Lesson> lessons = lessonService.findById(id);
        return ResponseEntity.ok().body(lessons);
    }
}
