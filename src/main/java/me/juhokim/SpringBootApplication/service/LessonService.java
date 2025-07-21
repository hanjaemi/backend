package me.juhokim.SpringBootApplication.service;

import me.juhokim.SpringBootApplication.domain.Lesson;
import me.juhokim.SpringBootApplication.domain.LessonSection;
import me.juhokim.SpringBootApplication.repository.LessonRepository;
import me.juhokim.SpringBootApplication.repository.LessonSectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {
    @Autowired
    LessonRepository lessonRepository;

    public List<Lesson> findById(Long section_id){
        return lessonRepository.findBySectionId(section_id);
    }

}
