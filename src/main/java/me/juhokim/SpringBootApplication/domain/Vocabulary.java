package me.juhokim.SpringBootApplication.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Vocabulary")
public class Vocabulary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vocab_id")
    private Long vocabId;

    @Column(name = "lesson_id", nullable = false)
    private Long lessonId;

    @Column(name = "word", length = 50)
    private String word;

    @Column(name = "definition", length = 255)
    private String definition;

    @Column(name = "example_sentence", columnDefinition = "TEXT")
    private String example_sentence;
}
