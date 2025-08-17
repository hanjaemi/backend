package me.juhokim.SpringBootApplication.service;

import me.juhokim.SpringBootApplication.domain.Lesson;
import me.juhokim.SpringBootApplication.repository.GrammarRepository;
import me.juhokim.SpringBootApplication.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {
    @Autowired
    LessonRepository lessonRepository;

    GrammarRepository grammarRepository;

    public List<Lesson> findByDifficulty(Long id){
        return lessonRepository.findByDifficulty_DifficultyId(id)
                .orElseThrow(() -> new IllegalArgumentException("not found " + id));
    }

    public Lesson findById(long id){
        return lessonRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found " + id));
    }

}
