package me.juhokim.SpringBootApplication.service;

import me.juhokim.SpringBootApplication.domain.Difficulty;
import me.juhokim.SpringBootApplication.repository.DifficultyLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DifficultyLevelService {
    @Autowired
    DifficultyLevelRepository difficultyLevelRepository;

    public List<Difficulty> findAll(){
        return difficultyLevelRepository.findAll();
    }
}
