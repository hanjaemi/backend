package me.juhokim.SpringBootApplication.dto;


import lombok.Getter;
import lombok.Setter;
import me.juhokim.SpringBootApplication.domain.User;

@Setter
@Getter
public class UserRequest {
    private String supabaseId;

    public User toEntity(){
        return User.builder()
                .supabaseId(supabaseId)
                .build();
    }
}
