package me.juhokim.SpringBootApplication.repository;

import me.juhokim.SpringBootApplication.domain.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatRepository extends JpaRepository<Chat, Long> {

    List<Chat> findByUserId(Long userId);

    Chat findByChatId(Long chatId);
}
