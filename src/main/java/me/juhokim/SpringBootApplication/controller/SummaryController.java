package me.juhokim.SpringBootApplication.controller;

import org.springframework.web.bind.annotation.RestController;
import me.juhokim.SpringBootApplication.service.SummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import me.juhokim.SpringBootApplication.domain.Summary;

@RestController
public class SummaryController {
    @Autowired
    SummaryService summaryService;

    @GetMapping("/difficulty/{id}/lessons/{section_id}/summary/{lesson_id}")
    ResponseEntity<List<Summary>> getSummary(@PathVariable Long lesson_id){
        List<Summary> summaries = summaryService.findByLessonId(lesson_id);
        return ResponseEntity.ok().body(summaries);
    }
}
