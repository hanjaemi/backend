package me.juhokim.SpringBootApplication.service;

import me.juhokim.SpringBootApplication.domain.User;
import me.juhokim.SpringBootApplication.domain.Word;
import me.juhokim.SpringBootApplication.repository.UserRepository;
import me.juhokim.SpringBootApplication.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordService {

    @Autowired
    WordRepository wordRepository;

    public List<Word> findAll(){
        return wordRepository.findAll();
    }
}
