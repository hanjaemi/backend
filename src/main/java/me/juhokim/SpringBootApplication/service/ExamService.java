package me.juhokim.SpringBootApplication.service;


import lombok.RequiredArgsConstructor;
import me.juhokim.SpringBootApplication.domain.Exam;
import me.juhokim.SpringBootApplication.repository.ExamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ExamService {
    private final ExamRepository examRepository;

    // Return all exams for a lesson
    public List<Exam> findByLessonId(long lessonId){
        return examRepository.findByLessonId(lessonId)
                .orElseThrow(() -> new IllegalArgumentException("Not found "+ lessonId));
    }


}
