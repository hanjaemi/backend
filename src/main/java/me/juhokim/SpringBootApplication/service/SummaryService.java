package me.juhokim.SpringBootApplication.service;

import org.springframework.stereotype.Service;
import me.juhokim.SpringBootApplication.repository.SummaryRepository;
import lombok.RequiredArgsConstructor;
import me.juhokim.SpringBootApplication.domain.Summary;
import java.util.List;


@RequiredArgsConstructor
@Service
public class SummaryService {
    private final SummaryRepository summaryRepository;

    public List<Summary> findByLessonId(Long lessonId) {
        return summaryRepository.findByLessonId(lessonId)
                .orElseThrow(() -> new IllegalArgumentException("Not found " + lessonId));
    }
}
