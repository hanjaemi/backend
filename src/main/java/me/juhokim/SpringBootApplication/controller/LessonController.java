package me.juhokim.SpringBootApplication.controller;


import lombok.RequiredArgsConstructor;
import me.juhokim.SpringBootApplication.domain.*;
import me.juhokim.SpringBootApplication.dto.LessonDetail;
import me.juhokim.SpringBootApplication.dto.LessonPreview;
import me.juhokim.SpringBootApplication.service.ExamService;
import me.juhokim.SpringBootApplication.service.GrammarService;
import me.juhokim.SpringBootApplication.service.LessonService;
import me.juhokim.SpringBootApplication.service.VocabularyService;
import me.juhokim.SpringBootApplication.service.SummaryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@RestController
public class LessonController {
    private final LessonService lessonService;
    private final GrammarService grammarService;
    private final VocabularyService vocabularyService;
    private final ExamService examService;
    private final SummaryService summaryService;


    List<Grammar> grammars = null;
    List<Vocabulary> vocabs = null;
    List<Exam> exams = null;
    List<Summary> summaries = null;



    // [GET] All lesson previews for a level
    @GetMapping("/difficulty/{id}")
    ResponseEntity<List<LessonPreview>> getLessonPreview(@PathVariable long id){

        List<Lesson> lessonPreviews = lessonService.findByDifficulty(id);

        return ResponseEntity.ok(
                lessonPreviews.stream()
                        .map(LessonPreview::new)
                        .toList());
    }

    // [GET] All lesson details for a level
    @GetMapping("/difficulty/{id}/lessons")
    ResponseEntity<List<LessonDetail>> getLessonDetails(@PathVariable long id){

        // 1. Find all lessons in difficulty Id
        List<Lesson> lessons = lessonService.findByDifficulty(id);
        List<LessonDetail> lessonDetails = new ArrayList<>();


        // 2. Add all corresponding grammar, vocabulary, exams for every lesson
        for (Lesson lesson : lessons){
            long lessonId = lesson.getLessonId();
            grammars = grammarService.findByLessonId(lessonId);
            vocabs = vocabularyService.findByLessonId(lessonId);
            exams = examService.findByLessonId(lessonId);
            summaries = summaryService.findByLessonId(lessonId);

            lessonDetails.add(new LessonDetail(id, lessonId, grammars, vocabs, exams, summaries));
        }


        return ResponseEntity.ok(lessonDetails);
    }


    // [GET] One lesson detail for a level
    @GetMapping("/difficulty/{id}/lessons/{lessonId}")
    ResponseEntity<LessonDetail> getLessonDetail(@PathVariable long id, @PathVariable long lessonId){

        // 1. Find all lessons in difficulty Id
        List<Lesson> lessons = lessonService.findByDifficulty(id);


        // 2. Find the corresponding grammar, vocabulary, exams
        boolean lessonExists = false;
        for (Lesson lesson : lessons){
            if (lesson.getLessonId() == lessonId){
                lessonExists = true;
            }
        }

        // 3. Find grammars, vocabs, exams if exists
        if  (lessonExists){
            grammars = grammarService.findByLessonId(lessonId);
            vocabs = vocabularyService.findByLessonId(lessonId);
            exams = examService.findByLessonId(lessonId);
        }


        LessonDetail lessonDetails = new LessonDetail(id, lessonId, grammars, vocabs, exams, summaries);

        return ResponseEntity.ok(lessonDetails);
    }

//    // [GET] All lesson sections for each level
//    @GetMapping("/difficulty-levels/{difficulty_id}/lessons")
//    ResponseEntity<List<Lesson>> getLessons(@PathVariable Long difficulty_id){
//        List<Lesson> lessons = lessonService.findById(difficulty_id);
//        return ResponseEntity.ok().body(lessons);
//    }
}
