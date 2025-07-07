package me.juhokim.SpringBootApplication.repository;

import me.juhokim.SpringBootApplication.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom query methods here, if needed
}
