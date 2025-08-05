package me.juhokim.SpringBootApplication.service;

import me.juhokim.SpringBootApplication.domain.Difficulty;
import me.juhokim.SpringBootApplication.repository.DifficultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DifficultyService {
    @Autowired
    DifficultyRepository difficultyLevelRepository;

    public List<Difficulty> findAll(){
        return difficultyLevelRepository.findAll();
    }
}
