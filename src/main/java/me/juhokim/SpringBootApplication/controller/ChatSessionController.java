package me.juhokim.SpringBootApplication.controller;

import me.juhokim.SpringBootApplication.domain.ChatSession;
import me.juhokim.SpringBootApplication.service.ChatSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatSessionController {
    @Autowired
    ChatSessionService chatSessionService;

    @GetMapping("/users/{userId}/chat-sessions")
    ResponseEntity<List<ChatSession>> getChatSession(@PathVariable Long userId){
        List<ChatSession> chatSessions = chatSessionService.findByUserId(userId);
        return ResponseEntity.ok().body(chatSessions);
    }
}
