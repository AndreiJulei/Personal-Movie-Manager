package com.yourname.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication combines:
// 1. @Configuration: Tags the class as a source of bean definitions for the application context.
// 2. @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings.
// 3. @ComponentScan: Finds other components, configurations, and services in the 'com.yourname.movies' package.
@SpringBootApplication
public class MoviesApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(MoviesApplication.class, args);
    }
}

