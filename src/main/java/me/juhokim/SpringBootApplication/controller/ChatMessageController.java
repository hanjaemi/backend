package me.juhokim.SpringBootApplication.controller;

import me.juhokim.SpringBootApplication.domain.ChatMessage;
import me.juhokim.SpringBootApplication.service.ChatMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChatMessageController {

    @Autowired
    private ChatMessageService chatMessageService;

    @GetMapping("/test")
    public String getTestPage(){
        return "please work test";
    }

    @GetMapping("/users/{userId}/chat-sessions/{chatId}")
    public ResponseEntity<List<ChatMessage>> getMessagesByChatIdForUser(
            @PathVariable Long userId,
            @PathVariable Long chatId) {
        List<ChatMessage> messages = chatMessageService.findByChatId(userId, chatId);
        return ResponseEntity.ok(messages);
    }
}
