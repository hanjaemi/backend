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

    @Column(name = "meaning", length = 255)
    private String meaning;

    @Column(name = "context", columnDefinition = "TEXT")
    private String context;

    @Column(name = "type", columnDefinition = "TEXT")
    private String type;

}
