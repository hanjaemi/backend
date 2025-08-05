package me.juhokim.SpringBootApplication.repository;

import me.juhokim.SpringBootApplication.domain.Difficulty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DifficultyRepository extends JpaRepository<Difficulty, Long> {
    // You can add custom query methods here, if needed
}
