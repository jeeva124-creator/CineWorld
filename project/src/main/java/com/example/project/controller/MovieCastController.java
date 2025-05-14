package com.example.project.controller;

import com.example.project.model.MovieCast;
import com.example.project.service.MovieCastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie_cast")
public class MovieCastController {

    @Autowired
    private MovieCastService movieCastService;

    // Get all MovieCast relationships
    @GetMapping
    public List<MovieCast> getAllMovieCasts() {
        return movieCastService.getAllMovieCasts();
    }

//    @GetMapping("/api/movie_cast/{movieid}")
//    public List<MovieCast> getMovieCastsId()
//    // Create a new MovieCast relationship
    @PostMapping
    public MovieCast createMovieCast(@RequestBody MovieCast movieCast) {
        return movieCastService.saveMovieCast(movieCast);
    }
}
