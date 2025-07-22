// ChatMessageService.java
package me.juhokim.SpringBootApplication.service;

import me.juhokim.SpringBootApplication.domain.ChatMessage;
import me.juhokim.SpringBootApplication.domain.ChatSession;
import me.juhokim.SpringBootApplication.dto.ChatMessageRequest;
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



    public List<ChatMessage> findByChatId(Long chatId) {
        return chatMessageRepository.findByChatId(chatId);
    }



    public ChatMessage save(ChatMessageRequest dto) {
        return chatMessageRepository.save(dto.toEntity());
    }



    public void deleteById(Long messageId) {
        chatMessageRepository.deleteById(messageId);
    }



    public ChatMessage updateById(Long messageId, ChatMessageRequest dto) {
        ChatMessage currentMessage = chatMessageRepository.findByMessageId(messageId);
        currentMessage.update(dto.getChatId(), dto.getContent());

        chatMessageRepository.save(currentMessage);

        return currentMessage;
    }
}
