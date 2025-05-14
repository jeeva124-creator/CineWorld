package com.example.project.service;

import com.example.project.model.Theater;
import com.example.project.repository.TheaterRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TheaterServiceImpl implements TheaterService {

    @Autowired
    private TheaterRepositry theaterRepository;

    @Override
    public List<Theater> getAllTheaters() {
        return theaterRepository.findAll();
    }

    @Override
    public List<Theater> getTheaterById(int id) {
        return theaterRepository.findById( id);
    }

    @Override
    public Optional<Theater> getTheaterById(long id) {
        return Optional.empty();
    }

    @Override
    public Theater createTheater(Theater theater) {
        return theaterRepository.save(theater);
    }

    @Override
    public Optional<Theater> updateTheater(int id, Theater updatedTheater) {
        return Optional.empty();
    }

    @Override
    public boolean deleteTheater(int id) {
        return false;
    }


    @Override
    public List<Theater> findTheaterById(int id) {
        return theaterRepository.findById(id);
    }
}
