package me.juhokim.SpringBootApplication.controller;

import me.juhokim.SpringBootApplication.domain.Chat;
import me.juhokim.SpringBootApplication.dto.ChatRequest;
import me.juhokim.SpringBootApplication.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChatController {
    @Autowired
    ChatService chatSessionService;

    // [GET] Get all chat sessions
    @GetMapping("/users/{userId}/chats")
    ResponseEntity<List<Chat>> getChatSession(@PathVariable Long userId){
        List<Chat> chatSessions = chatSessionService.findByUserId(userId);
        return ResponseEntity.ok().body(chatSessions);
    }


    // [POST] Create a Chat Session
    @PostMapping("/users/{userId}/chats")
    ResponseEntity<Chat> getChatSession(@RequestBody ChatRequest dto){
        Chat newChat = chatSessionService.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(newChat);
    }


    // [PUT] Update a chat session (chat title)
    @PutMapping("/users/{userId}/chats/{chat_id}")
    ResponseEntity<Chat> updateChatSession(@PathVariable long chat_id , @RequestBody ChatRequest dto){
        Chat updatedChat = chatSessionService.updateByChatId(chat_id, dto);
        return ResponseEntity.ok(updatedChat);
    }

    // [DELETE] Delete Chat session
    @DeleteMapping("/users/{userId}/chats/{chat_id}")
    ResponseEntity<Void> updateChatSession(@PathVariable long chat_id){
        chatSessionService.deleteByChatId(chat_id);
        return ResponseEntity.ok().build();
    }}
