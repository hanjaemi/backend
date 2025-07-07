package me.juhokim.SpringBootApplication.repository;

import me.juhokim.SpringBootApplication.domain.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Integer> {
}
