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
@Table(name = "Chat_Session")
public class ChatSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chat_id")
    private Long chatId;

    @Column(name = "chat_title")
    private String chatTitle;


    @Column(name = "user_id", nullable = false)
    private Long userId;


    @Column(name = "created_at", columnDefinition = "DATETIME")
    private LocalDateTime createdAt = LocalDateTime.now();


    @Builder
    public ChatSession(String chatTitle, Long userId){
        this.chatTitle = chatTitle;
        this.userId = userId;
    }

    public void update(String chatTitle, Long userId) {
        this.chatTitle = chatTitle;
        this.userId = userId;
    }
}
