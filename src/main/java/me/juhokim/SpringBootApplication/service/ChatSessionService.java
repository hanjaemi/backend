package me.juhokim.SpringBootApplication.service;

import me.juhokim.SpringBootApplication.domain.ChatSession;
import me.juhokim.SpringBootApplication.repository.ChatSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatSessionService {
    @Autowired
    ChatSessionRepository chatSessionRepository;

    public List<ChatSession> findByUserId(Long userId){
        return chatSessionRepository.findByUserId(userId);
    }
}
