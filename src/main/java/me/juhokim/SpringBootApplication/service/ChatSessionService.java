package me.juhokim.SpringBootApplication.service;

import me.juhokim.SpringBootApplication.domain.ChatSession;
import me.juhokim.SpringBootApplication.dto.ChatSessionRequest;
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

    public ChatSession save(ChatSessionRequest dto) {
        return chatSessionRepository.save(dto.toEntity());
    }



    public ChatSession updateByChatId(long chatId, ChatSessionRequest dto) {
        // 1. Find current chat to modify
        ChatSession currentChat = chatSessionRepository.findByChatId(chatId);

        // 2. Update the current chat title
        currentChat.update(dto.getChatTitle(), dto.getUserId());

        // 3. Save the chat with the new title
        chatSessionRepository.save(currentChat);
        return currentChat;
    }

    public void deleteByChatId(long chatId) {
        chatSessionRepository.deleteById(chatId);
    }
}
