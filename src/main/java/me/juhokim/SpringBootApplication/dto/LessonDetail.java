package me.juhokim.SpringBootApplication.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import me.juhokim.SpringBootApplication.domain.Exam;
import me.juhokim.SpringBootApplication.domain.Grammar;
import me.juhokim.SpringBootApplication.domain.Vocabulary;
import me.juhokim.SpringBootApplication.domain.Summary;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
public class LessonDetail {
    private long difficulty_id;
    private long lesson_id;
    private List<Grammar> grammars;
    private List<Vocabulary> vocabs;
    private List<Exam> exams;
    private List<Summary> summaries;

}
