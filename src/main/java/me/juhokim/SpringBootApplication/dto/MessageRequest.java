package me.juhokim.SpringBootApplication.dto;


import lombok.Getter;
import me.juhokim.SpringBootApplication.domain.Message;

@Getter
public class MessageRequest {
    Long chatId;
    String content;

    public Message toEntity(){

        return Message.builder()
                .chatId(chatId)
                .content(content)
                .build();
    }
}
