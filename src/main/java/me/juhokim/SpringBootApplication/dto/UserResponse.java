package me.juhokim.SpringBootApplication.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    private String message;
    private long userId;

    public UserResponse(String message, long userId){
        this.message = message;
        this.userId = userId;
    }
}
