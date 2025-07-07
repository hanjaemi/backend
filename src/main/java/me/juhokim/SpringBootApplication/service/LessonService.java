package me.juhokim.SpringBootApplication.service;

import me.juhokim.SpringBootApplication.domain.Lesson;
import me.juhokim.SpringBootApplication.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {
    @Autowired
    LessonRepository lessonRepository;

    public List<Lesson> findAll(){
        return lessonRepository.findAll();
    }

    public List<Lesson> findById(Integer id){
        return lessonRepository.findByDifficultyId(id);
    }



}
