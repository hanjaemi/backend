package me.juhokim.SpringBootApplication.repository;

import me.juhokim.SpringBootApplication.domain.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Integer> {
}
