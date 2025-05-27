package com.example.project.controller;

import com.example.project.model.Theater;
import com.example.project.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/theaters")
@CrossOrigin("http://127.0.0.1:5501")
public class TheaterController {

    @Autowired
    private TheaterService theaterService;

    @GetMapping
    public List<Theater> getAllTheaters() {
        return theaterService.getAllTheaters();
    }

    @GetMapping("/{id}")
    public List<Theater> getTheaterById(@PathVariable int id) {
        return theaterService.getTheaterById(id);
    }

    @PostMapping
    public Theater createTheater(@RequestBody Theater theater) {
        return theaterService.createTheater(theater);
    }

    @PutMapping("/{id}")
    public Optional<Theater> updateTheater(@PathVariable int id, @RequestBody Theater updatedTheater) {
        return theaterService.updateTheater(id, updatedTheater);
    }

    @DeleteMapping("/{id}")
    public boolean deleteTheater(@PathVariable int id) {
        return theaterService.deleteTheater(id);
    }

    // Optional: Custom route for finding by ID as list
    @GetMapping("/find/{id}")
    public List<Theater> findTheaterById(@PathVariable int id) {
        return theaterService.findTheaterById(id);
    }
}
