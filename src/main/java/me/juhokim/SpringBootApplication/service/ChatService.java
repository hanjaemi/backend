package me.juhokim.SpringBootApplication.service;

import me.juhokim.SpringBootApplication.domain.Chat;
import me.juhokim.SpringBootApplication.dto.ChatSessionRequest;
import me.juhokim.SpringBootApplication.repository.ChatSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatSessionService {
    @Autowired
    ChatSessionRepository chatSessionRepository;

    public List<Chat> findByUserId(Long userId){
        return chatSessionRepository.findByUserId(userId);
    }

    public Chat save(ChatSessionRequest dto) {
        return chatSessionRepository.save(dto.toEntity());
    }



    public Chat updateByChatId(long chatId, ChatSessionRequest dto) {
        // 1. Find current chat to modify
        Chat currentChat = chatSessionRepository.findByChatId(chatId);

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
