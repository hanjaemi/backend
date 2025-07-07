package me.juhokim.SpringBootApplication.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Getter
@Entity
public class Word {
    @Id
    private int word_id;

    @ManyToOne
    @JoinColumn(name = "language_id", nullable = false)
    private Language language;

    private String text;
    private String pronounciation;
    private String part_of_speech;
}
