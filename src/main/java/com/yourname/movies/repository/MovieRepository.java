package com.yourname.movies.repository;

import com.yourname.movies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List; 

public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findByDirector(String director);

    List<Movie> findByTitleContainingIgnoreCase(String title);
}