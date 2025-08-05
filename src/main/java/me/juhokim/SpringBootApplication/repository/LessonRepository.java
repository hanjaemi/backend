package me.juhokim.SpringBootApplication.repository;

import me.juhokim.SpringBootApplication.domain.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {

    Optional<List<Lesson>> findByDifficulty_DifficultyId(Long id);

    Optional<Lesson> findById(Long id);
}
