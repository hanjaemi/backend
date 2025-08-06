package me.juhokim.SpringBootApplication.controller;

import me.juhokim.SpringBootApplication.domain.Message;
import me.juhokim.SpringBootApplication.dto.MessageRequest;
import me.juhokim.SpringBootApplication.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MessageController {

    @Autowired
    private MessageService chatMessageService;


    // [Post] Send a chat message (x)
    @PostMapping("/users/{userId}/chats/{chat_id}")
    public ResponseEntity<Message> createChatMessage(@RequestBody MessageRequest dto){
        Message newMessage = chatMessageService.save(dto);
        return ResponseEntity.ok(newMessage);
    }

    // [GET] Get all chat messages (x)
    @GetMapping("/users/{userId}/chats/{chatId}")
    public ResponseEntity<List<Message>> getMessagesByChatIdForUser(
            @PathVariable Long chatId) {
        List<Message> messages = chatMessageService.findByChatId(chatId);
        return ResponseEntity.ok(messages);
    }


    // [PUT] Update Chat Message (X)
    @PutMapping("/users/{userId}/chats/{chat_id}/messages/{message_id}")
    public ResponseEntity<Message> updateMessage(@PathVariable Long message_id, @RequestBody MessageRequest dto){
        Message updatedMessage = chatMessageService.updateById(message_id, dto);
        return ResponseEntity.ok(updatedMessage);
    }


    // [Delete] Delete Chat Message (X)
    @DeleteMapping("/users/{userId}/chats/{chatId}/messages/{message_id}")
    public ResponseEntity<Void> deleteMessage(@PathVariable Long message_id){
        chatMessageService.deleteById(message_id);
        return ResponseEntity.ok().build();
    }

}
