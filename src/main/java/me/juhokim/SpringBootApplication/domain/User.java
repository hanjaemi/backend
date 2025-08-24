package me.juhokim.SpringBootApplication.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "supabaseId")
    private String supabaseId;

    @Column(name = "created_at")
    private Date createdAt = new Date();

    @Builder
    public User(String supabaseId){
        this.supabaseId = supabaseId;
    }
}
