package me.juhokim.SpringBootApplication.service;

import me.juhokim.SpringBootApplication.domain.Language;
import me.juhokim.SpringBootApplication.domain.User;
import me.juhokim.SpringBootApplication.repository.LanguageRepository;
import me.juhokim.SpringBootApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {
    @Autowired
    LanguageRepository languageRepository;

    public List<Language> findAll(){
        return languageRepository.findAll();
    }
}
