package me.juhokim.SpringBootApplication.service;

import me.juhokim.SpringBootApplication.domain.LessonSection;
import me.juhokim.SpringBootApplication.repository.LessonSectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonSectionService {
    @Autowired
    LessonSectionRepository lessonSectionRepository;


    public List<LessonSection> findById(Integer id){
        return lessonSectionRepository.findByDifficultyId(id);
    }



}
