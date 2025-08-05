package me.juhokim.SpringBootApplication.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "grammar")
public class Grammar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grammar_id")
    private Long grammarId;

    @Column(name = "lesson_id", nullable = false)
    private Long lessonId;

    @Column(name = "title", length = 50)
    private String title;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "example", columnDefinition = "TEXT")
    private String example;

    @Column(name = "translation", columnDefinition = "TEXT")
    private String translation;

    @Column(name = "type", columnDefinition = "TEXT")
    private String type;
}
