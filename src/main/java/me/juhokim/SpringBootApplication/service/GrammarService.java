// ChatMessageService.java
package me.juhokim.SpringBootApplication.service;

import me.juhokim.SpringBootApplication.domain.ChatMessage;
import me.juhokim.SpringBootApplication.domain.Grammar;
import me.juhokim.SpringBootApplication.repository.ChatMessageRepository;
import me.juhokim.SpringBootApplication.repository.ChatSessionRepository;
import me.juhokim.SpringBootApplication.repository.GrammarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrammarService {

    @Autowired
    GrammarRepository grammarRepository;


    public List<Grammar> findByLessonId(Long lesson_id) {
        return grammarRepository.findByLessonId(lesson_id);
    }
}
