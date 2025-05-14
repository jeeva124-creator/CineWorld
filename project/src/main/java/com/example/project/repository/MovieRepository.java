package com.example.project.repository;

import com.example.project.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findByMovieNameContainingIgnoreCase(String movieName);

    Movie findMovieWithCastById(Long movieId);


}
