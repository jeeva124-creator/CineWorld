package com.example.project.controller;

import com.example.project.model.Seat;

import com.example.project.service.SeatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seats")
@CrossOrigin("http://127.0.0.1:5501")
public class SeatController {


    private final SeatService seatService;


    @Autowired
    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    @PostMapping("/create/{showId}")
    public String generateSeatsForShow(@PathVariable long showId) {
        seatService.generateSeatsForShow(showId);
        return "Seats created";
    }


    // GET request to retrieve all seats for a specific show
    @GetMapping("/show/{showId}")
    public List<Seat> getSeatsForShow(@PathVariable Long showId) {
        return seatService.getSeatsForShow(showId);  // Retrieve seats for the show
    }

}
