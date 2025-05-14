package com.example.project.service;


import com.example.project.model.MovieCast;
import com.example.project.repository.MovieCastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieCastService {

    @Autowired
    private MovieCastRepository movieCastRepository;

    // Save a new MovieCast relationship
    public MovieCast saveMovieCast(MovieCast movieCast) {
        return movieCastRepository.save(movieCast);
    }

    // Fetch all MovieCast relationships
    public List<MovieCast> getAllMovieCasts() {
        return movieCastRepository.findAll();
    }
}