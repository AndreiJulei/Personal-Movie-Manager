package com.yourname.movies.controller;

import com.yourname.movies.model.Movie;
import com.yourname.movies.model.ViewingStatus;
import com.yourname.movies.service.MovieService; 
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController

@RequestMapping("/api/movies")
public class MovieController {
    
   
    @Autowired
    private MovieService movieService; 
    
    
    @GetMapping
    public Page<Movie> getAllMovies(
            @RequestParam(required = false) ViewingStatus status,
            @RequestParam(required = false) String director,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "title") String sortBy) {

        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());
        
        return movieService.getAllMovies(status, director, pageable);
    }
    
    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }
    
    @PostMapping
    public Movie createMovie(@Valid @RequestBody Movie movie) {
        return movieService.createMovie(movie);
    }
    

    @PutMapping("/{id}")
    public Movie updateMovie(@PathVariable Long id, @Valid @RequestBody Movie updatedMovie) {
        return movieService.updateMovie(id, updatedMovie);
    }
   
    @PatchMapping("/{id}/rating")
    public Movie updateMovieRating(@PathVariable Long id, @RequestParam Integer rating) {
        return movieService.updateMovieRating(id, rating);
    }
   
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        
        return ResponseEntity.noContent().build();
    }
}