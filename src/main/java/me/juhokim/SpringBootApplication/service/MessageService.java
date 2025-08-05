// ChatMessageService.java
package me.juhokim.SpringBootApplication.service;

import me.juhokim.SpringBootApplication.domain.Message;
import me.juhokim.SpringBootApplication.dto.MessageRequest;
import me.juhokim.SpringBootApplication.repository.MessageRepository;
import me.juhokim.SpringBootApplication.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private ChatRepository chatSessionRepository;

    @Autowired
    private MessageRepository chatMessageRepository;



    public List<Message> findByChatId(Long chatId) {
        return chatMessageRepository.findByChatId(chatId);
    }



    public Message save(MessageRequest dto) {
        return chatMessageRepository.save(dto.toEntity());
    }



    public void deleteById(Long messageId) {
        chatMessageRepository.deleteById(messageId);
    }



    public Message updateById(Long messageId, MessageRequest dto) {
        Message currentMessage = chatMessageRepository.findByMessageId(messageId);
        currentMessage.update(dto.getChatId(), dto.getContent());

        chatMessageRepository.save(currentMessage);

        return currentMessage;
    }
}
