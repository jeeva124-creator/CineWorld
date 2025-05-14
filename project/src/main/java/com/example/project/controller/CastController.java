package com.example.project.controller;


import com.example.project.repository.CastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.project.model.Cast;
import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/api/casts")
public class CastController {

    @Autowired
    private CastRepository castRepository;

    // Get all casts
    @GetMapping
    public List<Cast> getAllCasts() {
        return castRepository.findAll();
    }

    // Get cast by ID
    @GetMapping("/{id}")
    public Optional<Object> getCastById(@PathVariable Integer id) {
        return Optional.ofNullable(castRepository.findById(id));
    }

    // Create a new cast
    @PostMapping
    public Cast createCast(@RequestBody Cast cast) {
        return castRepository.save(cast);
    }


    // Update an existing cast
    @PutMapping("/{id}")
    public Cast updateCast(@PathVariable Integer id, @RequestBody Cast updatedCast) {
        return castRepository.findById(id).map(cast -> {
            cast.setName(updatedCast.getName());
            cast.setImg(updatedCast.getImg());
            cast.setAge(updatedCast.getAge());
            return castRepository.save(cast);
        }).orElseThrow(() -> new RuntimeException("Cast not found with id " + id));




    }


}