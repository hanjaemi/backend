package me.juhokim.SpringBootApplication.controller;

import me.juhokim.SpringBootApplication.domain.ChatSession;
import me.juhokim.SpringBootApplication.dto.ChatSessionRequest;
import me.juhokim.SpringBootApplication.service.ChatSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChatSessionController {
    @Autowired
    ChatSessionService chatSessionService;

    // [GET] Get all chat sessions
    @GetMapping("/users/{userId}/chat-sessions")
    ResponseEntity<List<ChatSession>> getChatSession(@PathVariable Long userId){
        List<ChatSession> chatSessions = chatSessionService.findByUserId(userId);
        return ResponseEntity.ok().body(chatSessions);
    }


    // [POST] Create a Chat Session
    @PostMapping("/users/{userId}/chat-sessions")
    ResponseEntity<ChatSession> getChatSession(@RequestBody ChatSessionRequest dto){
        ChatSession newChat = chatSessionService.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(newChat);
    }


    // [PUT] Update a chat session (chat title)
    @PutMapping("/users/{userId}/chat-sessions/{chat_id}")
    ResponseEntity<ChatSession> updateChatSession(@PathVariable long chat_id , @RequestBody ChatSessionRequest dto){
        ChatSession updatedChat = chatSessionService.updateByChatId(chat_id, dto);
        return ResponseEntity.ok(updatedChat);
    }

    // [DELETE] Delete Chat session
    @DeleteMapping("/users/{userId}/chat-sessions/{chat_id}")
    ResponseEntity<Void> updateChatSession(@PathVariable long chat_id){
        chatSessionService.deleteByChatId(chat_id);
        return ResponseEntity.ok().build();
    }}
