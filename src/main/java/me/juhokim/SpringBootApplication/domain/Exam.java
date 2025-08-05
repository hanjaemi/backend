package me.juhokim.SpringBootApplication.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "exam")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exam_id", updatable = false)
    private Long examId;

    @Column(name = "lesson_id", nullable = false)
    private Long lessonId;

    @Column(name="question", nullable = false)
    private String question;

    @Column(name="options", nullable = false)
    private String options;

    @Column(name="correct_answer", nullable = false)
    private String correctAnswer;
}