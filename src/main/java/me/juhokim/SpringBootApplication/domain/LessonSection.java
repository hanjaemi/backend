package me.juhokim.SpringBootApplication.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Lesson_Section")
public class LessonSection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "section_id")
    private Long sectionId;

    @Column(name = "difficulty_id", nullable = false)
    private Long difficultyId;

    @Column(name = "section_type", length = 50)
    private String sectionType;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;
}
