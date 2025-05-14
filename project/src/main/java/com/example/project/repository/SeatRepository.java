package com.example.project.repository;
import com.example.project.dto.SeatInputRequest;


import com.example.project.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat, Long> {
    List<Seat> findByShowId(Long showId);

}