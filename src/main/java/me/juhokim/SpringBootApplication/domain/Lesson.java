package me.juhokim.SpringBootApplication.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Getter
@Entity
public class Lesson {
    @Id
    private Integer lesson_id;

    private Integer difficultyId;
    private Integer language_id;
    private String title;
    private String description;
    private Integer sequence_order;
    private Integer estimated_duration;
}
