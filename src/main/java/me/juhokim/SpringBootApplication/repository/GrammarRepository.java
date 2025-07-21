package me.juhokim.SpringBootApplication.repository;

import me.juhokim.SpringBootApplication.domain.Grammar;
import me.juhokim.SpringBootApplication.domain.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GrammarRepository extends JpaRepository<Grammar, Long> {

    List<Grammar> findByLessonId(Long lessonId);
}
