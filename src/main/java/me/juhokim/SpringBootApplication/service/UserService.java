package me.juhokim.SpringBootApplication.service;

import me.juhokim.SpringBootApplication.domain.User;
import me.juhokim.SpringBootApplication.dto.UserRequest;
import me.juhokim.SpringBootApplication.dto.UserResponse;
import me.juhokim.SpringBootApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(long userId){
        return userRepository.findById(userId).orElseThrow(()->new IllegalArgumentException("not found " + userId));
    }

    public User save(UserRequest dto){
        return userRepository.save(dto.toEntity());
    }

    public UserResponse authenticateWithToken(UserRequest dto){
        String message = "";
        Long userId = 0L;

        try {
            User user = userRepository.findBySupabaseId(dto.getSupabaseId());
            userId = user.getUserId();
            message = "Authentication Succesful";
        } catch(Exception e){
            message = "Authentication failed";
        }



        // 3. Return message and userId
        return new UserResponse(message, userId);
    }
}
