package com.example.project.service;

import com.example.project.model.Theater;

import java.util.List;
import java.util.Optional;

public interface TheaterService {
    List<Theater> getAllTheaters();

    List<Theater> getTheaterById(int id);

    Optional<Theater> getTheaterById(long id);

    Theater createTheater(Theater theater);

    Optional<Theater> updateTheater(int id, Theater updatedTheater);

    boolean deleteTheater(int id);
    List<Theater> findTheaterById(int id);
}
