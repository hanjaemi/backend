package me.juhokim.SpringBootApplication.dto;


import lombok.Getter;
import lombok.Setter;
import me.juhokim.SpringBootApplication.domain.Lesson;

@Setter
@Getter
public class LessonPreview {
    private long difficulty_id;
    private String title;
    private String description;
    private String estimated_duration;

    public LessonPreview(Lesson lesson){
        this.difficulty_id = lesson.getDifficulty().getDifficultyId();
        this.title = lesson.getTitle();
        this.description = lesson.getDescription();
        this.estimated_duration = lesson.getEstimatedDuration();
    }
}
