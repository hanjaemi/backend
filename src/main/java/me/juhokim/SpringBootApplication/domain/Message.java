package me.juhokim.SpringBootApplication.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "message")
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private Long messageId;

    @Column(name = "chat_id", nullable = false)
    private Long chatId;

    @Enumerated(EnumType.STRING)
    @Column(name = "sender", nullable = false)
    private SenderType sender = SenderType.user;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    @Column(name = "timestamp")
    private LocalDateTime timestamp = LocalDateTime.now();


    @Builder
    public ChatMessage(Long chatId, String content){
        this.chatId = chatId;
        this.content = content;
    }

    public void update(Long chatId, String content) {
        this.chatId = chatId;
        this.content = content;
    }

    public enum SenderType {
        user, system
    }
}
