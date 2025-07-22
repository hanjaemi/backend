package me.juhokim.SpringBootApplication.dto;


import lombok.Getter;
import me.juhokim.SpringBootApplication.domain.ChatSession;

@Getter
public class ChatSessionRequest {
    String chatTitle;
    Long userId;

    public ChatSession toEntity(){

        return ChatSession.builder()
                .chatTitle(chatTitle)
                .userId(userId)
                .build();
    }
}
