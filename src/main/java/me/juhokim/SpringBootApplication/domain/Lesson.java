package me.juhokim.SpringBootApplication.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Lesson")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lesson_id")
    private Long lessonId;

    @ManyToOne
    @JoinColumn(name = "difficulty_id", nullable = false)
    private Difficulty difficulty;

    @Column(name = "title", length = 50)
    private String title;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "estimated_duration", columnDefinition = "TEXT")
    private String estimatedDuration;
}
