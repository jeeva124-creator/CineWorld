package com.example.project.service;

import com.example.project.model.Movie;
import com.example.project.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    // Get all movies
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }


    // Get movie by ID
    public Optional<Movie> getMovieById(Long id) {
        return movieRepository.findById(id);
    }

    // Get movie with cast (assuming you have a method in the repository to fetch movie with cast)
    public Movie getMovieWithCast(Long movieId) {
        return movieRepository.findMovieWithCastById(movieId);
    }

    // Add a new movie
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    // Update an existing movie
    public Movie updateMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    // Delete a movie
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }

    // Search movies by name
    public List<Movie> searchMovies(String query) {
        // Use the repository method to find movies by their name
        return movieRepository.findByMovieNameContainingIgnoreCase(query);
    }

}
