package me.juhokim.SpringBootApplication.repository;

import me.juhokim.SpringBootApplication.domain.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Integer> {
    List<Lesson> findByDifficultyId(Integer difficulty_id);
}
