package me.juhokim.SpringBootApplication.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "summary")
public class Summary {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "summary_id", updatable = false)
    private Long summaryId;

    @Column(name = "lesson_id", nullable = false)
    private Long lessonId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;
}
