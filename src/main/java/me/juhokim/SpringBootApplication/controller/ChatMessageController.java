package me.juhokim.SpringBootApplication.controller;

import me.juhokim.SpringBootApplication.domain.ChatMessage;
import me.juhokim.SpringBootApplication.dto.ChatMessageRequest;
import me.juhokim.SpringBootApplication.service.ChatMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChatMessageController {

    @Autowired
    private ChatMessageService chatMessageService;


    // [Post] Send a chat message (x)
    @PostMapping("/users/{userId}/chat-sessions/{chat_id}")
    public ResponseEntity<ChatMessage> createChatMessage(@RequestBody ChatMessageRequest dto){
        ChatMessage newMessage = chatMessageService.save(dto);
        return ResponseEntity.ok(newMessage);
    }

    // [GET] Get all chat messages (x)
    @GetMapping("/users/{userId}/chat-sessions/{chatId}")
    public ResponseEntity<List<ChatMessage>> getMessagesByChatIdForUser(
            @PathVariable Long chatId) {
        List<ChatMessage> messages = chatMessageService.findByChatId(chatId);
        return ResponseEntity.ok(messages);
    }


    // [PUT] Update Chat Message (X)
    @PutMapping("/users/{userId}/chat-sessions/{chat_id}/message/{message_id}")
    public ResponseEntity<ChatMessage> updateMessage(@PathVariable Long message_id, @RequestBody ChatMessageRequest dto){
        ChatMessage updatedMessage = chatMessageService.updateById(message_id, dto);
        return ResponseEntity.ok(updatedMessage);
    }


    // [Delete] Delete Chat Message (X)
    @DeleteMapping("/users/{userId}/chat-sessions/{chatId}/message/{message_id}")
    public ResponseEntity<Void> deleteMessage(@PathVariable Long message_id){
        chatMessageService.deleteById(message_id);
        return ResponseEntity.ok().build();
    }

}
