package com.example.project.repository;

import com.example.project.model.Show;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {

    @Query("SELECT s FROM Show s WHERE s.movie.id = :movieId ")
    List<Show> findPastOrCurrentShowsByMovieId(@Param("movieId") Long movieId);

}

