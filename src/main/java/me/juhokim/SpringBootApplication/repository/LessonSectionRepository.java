package me.juhokim.SpringBootApplication.repository;

import me.juhokim.SpringBootApplication.domain.LessonSection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonSectionRepository extends JpaRepository<LessonSection, Integer> {
    List<LessonSection> findByDifficultyId(Integer difficulty_id);
}
