package me.juhokim.SpringBootApplication.repository;

import me.juhokim.SpringBootApplication.domain.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ExamRepository extends JpaRepository<Exam, Long> {
    Optional<List<Exam>> findByLessonId(long lessonId);
}
