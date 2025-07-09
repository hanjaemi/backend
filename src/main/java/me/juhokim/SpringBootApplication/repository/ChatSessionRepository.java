package me.juhokim.SpringBootApplication.repository;

import io.micrometer.observation.ObservationFilter;
import me.juhokim.SpringBootApplication.domain.ChatMessage;
import me.juhokim.SpringBootApplication.domain.ChatSession;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatSessionRepository extends JpaRepository<ChatSession, Long> {

    List<ChatSession> findByUserId(Long userId);

    ObservationFilter findByUserIdAndChatId(Long userId, Long chatId);
}
