package com.example.project.repository;

import com.example.project.model.MovieCast;
import com.example.project.model.MovieCastId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieCastRepository extends JpaRepository<MovieCast, MovieCastId> {

}