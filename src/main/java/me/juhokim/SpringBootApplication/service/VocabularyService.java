// ChatMessageService.java
package me.juhokim.SpringBootApplication.service;

import me.juhokim.SpringBootApplication.domain.Grammar;
import me.juhokim.SpringBootApplication.domain.Vocabulary;
import me.juhokim.SpringBootApplication.repository.GrammarRepository;
import me.juhokim.SpringBootApplication.repository.VocabularyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VocabularyService {

    @Autowired
    VocabularyRepository vocabularyRepository;


    public List<Vocabulary> findByLessonId(Long lesson_id) {
        return vocabularyRepository.findByLessonId(lesson_id);
    }
}
