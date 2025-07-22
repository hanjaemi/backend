package me.juhokim.SpringBootApplication.dto;


import lombok.Getter;
import me.juhokim.SpringBootApplication.domain.ChatMessage;
import me.juhokim.SpringBootApplication.domain.ChatSession;

@Getter
public class ChatMessageRequest {
    Long chatId;
    String content;

    public ChatMessage toEntity(){

        return ChatMessage.builder()
                .chatId(chatId)
                .content(content)
                .build();
    }
}
