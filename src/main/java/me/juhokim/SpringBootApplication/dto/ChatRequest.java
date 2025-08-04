package me.juhokim.SpringBootApplication.dto;


import lombok.Getter;
import me.juhokim.SpringBootApplication.domain.Chat;

@Getter
public class ChatSessionRequest {
    String chatTitle;
    Long userId;

    public Chat toEntity(){

        return Chat.builder()
                .chatTitle(chatTitle)
                .userId(userId)
                .build();
    }
}
