package com.example.project.service;

import com.example.project.model.Seat;
import com.example.project.model.Show;
import com.example.project.repository.SeatRepository;
import com.example.project.repository.ShowRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SeatService {

    @Autowired
    private SeatRepository seatRepository;

    @Autowired
    private ShowRepository showRepository;

    // Method to create seats for a specific show

    public void generateSeatsForShow(long showId) {
        List<Seat> seats = new ArrayList<>();


        for (char row = 'A'; row <= 'J'; row++) {
            for (int col = 1; col <= 16; col++) {
                Seat seat = new Seat();
                seat.setRowLabel(String.valueOf(row));
                seat.setColumnNumber(col);
                seat.setBooked(false);
                seat.setSeatType("REGULAR");
                seat.setShowId(showId);
                seats.add(seat);

            }
        }
        seatRepository.saveAll(seats);
    }

    // Retrieve seats for the show
    public List<Seat> getSeatsForShow(Long showId) {
        return seatRepository.findByShowId(showId);
    }
}
