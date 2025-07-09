// ChatMessageService.java
package me.juhokim.SpringBootApplication.service;

import me.juhokim.SpringBootApplication.domain.ChatMessage;
import me.juhokim.SpringBootApplication.domain.ChatSession;
import me.juhokim.SpringBootApplication.repository.ChatMessageRepository;
import me.juhokim.SpringBootApplication.repository.ChatSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatMessageService {

    @Autowired
    private ChatSessionRepository chatSessionRepository;

    @Autowired
    private ChatMessageRepository chatMessageRepository;

    public List<ChatMessage> findByChatId(Long userId, Long chatId) {
        return chatMessageRepository.findByChatId(chatId);
    }
}
