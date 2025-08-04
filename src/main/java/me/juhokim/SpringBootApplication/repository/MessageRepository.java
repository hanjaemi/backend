// ChatMessageRepository.java
package me.juhokim.SpringBootApplication.repository;

import me.juhokim.SpringBootApplication.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatMessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByChatId(Long chatId);
    Message findByMessageId(Long messageId);
}
