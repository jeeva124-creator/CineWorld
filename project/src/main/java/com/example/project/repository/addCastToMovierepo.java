package com.example.project.repository;

import com.example.project.model.Cast;
import com.example.project.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface addCastToMovierepo extends JpaRepository<Movie, Long> {

}
