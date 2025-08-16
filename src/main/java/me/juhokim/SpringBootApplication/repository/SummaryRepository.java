package me.juhokim.SpringBootApplication.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import me.juhokim.SpringBootApplication.domain.Summary;

@Repository
public interface SummaryRepository extends JpaRepository<Summary, Long> {
    Optional<List<Summary>> findByLessonId(Long lessonId); 
}
