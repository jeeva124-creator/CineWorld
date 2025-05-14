package com.example.project.service;


import com.example.project.model.Show;
import com.example.project.repository.SeatRepository;
import com.example.project.repository.ShowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ShowService {

    @Autowired
    private ShowRepository showRepository;

    @Autowired
    private SeatRepository seatRepository;

    public List<Show> findPastOrCurrentShowsByMovieId(Long movieId) {
        return showRepository.findPastOrCurrentShowsByMovieId(movieId);
    }

    public Show save(Show show) {
        return showRepository.save(show);
    }


    public Optional<Show> findById(Long id) {
        return showRepository.findById(id);
    }

    public Optional<Show> update(Long id, Show updatedShow) {
        return showRepository.findById(id).map(existingShow -> {
            existingShow.setShowTime(updatedShow.getShowTime());
            existingShow.setMovie(updatedShow.getMovie());
            existingShow.setTheater(updatedShow.getTheater());
            existingShow.setShowdate(updatedShow.getShowdate());
            return showRepository.save(existingShow);
        });
    }

}