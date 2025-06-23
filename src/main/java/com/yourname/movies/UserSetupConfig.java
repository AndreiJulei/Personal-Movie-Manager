package com.yourname.movies;

import com.yourname.movies.model.User;
import com.yourname.movies.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserSetupConfig {

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            // Create a default user on startup
            if (userRepository.findByUsername("user") == null) {
                User defaultUser = new User();
                defaultUser.setUsername("user");
            // Set password 
                defaultUser.setPassword(passwordEncoder.encode("password")); 
                defaultUser.setRole("USER");
                userRepository.save(defaultUser);
                System.out.println("Default user created: user/password");
            }
        };
    }
}