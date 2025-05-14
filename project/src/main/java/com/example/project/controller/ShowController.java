package com.example.project.controller;

import com.example.project.dto.ShowTimingDTO;
import com.example.project.model.Show;
import com.example.project.service.ShowService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;




@RestController
@RequestMapping("/api/shows")
@RequiredArgsConstructor
@CrossOrigin("http://127.0.0.1:5500")

public class ShowController {

    @Autowired
    private ShowService showService;

    @GetMapping
    public ShowTimingDTO getShowTimings() {
        ShowTimingDTO dto = new ShowTimingDTO();
        dto.setShowTimings(List.of(
                "00:00 AM",
                "01:46 AM",
                "02:30 PM",
                "04:00 PM",
                "07:00 PM"
        ));
        return dto;
    }


    @PostMapping
    public ResponseEntity<Show> createShow(@RequestBody Show show) {
        Show savedShow = showService.save(show);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedShow);
    }

    // Get show by ID
    @GetMapping("/{id}")
    public ResponseEntity<Show> getShowById(@PathVariable Long id) {
        Optional<Show> show = showService.findById(id);
        return show.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Update an existing show
    @PutMapping("/{id}")
    public ResponseEntity<Show> updateShow(@PathVariable Long id, @RequestBody Show updatedShow) {
        Optional<Show> show = showService.update(id, updatedShow);
        return show.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}