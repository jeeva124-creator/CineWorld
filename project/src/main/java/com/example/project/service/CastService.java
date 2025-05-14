package com.example.project.service;

import com.example.project.model.Cast;
import com.example.project.repository.CastRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CastService {


    @Autowired
    private CastRepository castRepository;

    public List<Cast> getAllCastMembers() {
        return castRepository.findAll();
    }

    public Optional<Cast> getCastById(Long id) {
        return castRepository.findById(id);
    }

    public Cast createCast(Cast cast) {
        return castRepository.save(cast);
    }

    public Cast updateCast(Long id, Cast updatedCast) {
        return castRepository.findById(id).map(cast -> {
            cast.setName(updatedCast.getName());
            // Update other fields if you have any
            return castRepository.save(cast);
        }).orElseThrow(() -> new RuntimeException("Cast member not found with id " + id));
    }

    public void deleteCast(Long id) {
        castRepository.deleteById(id);
    }
}
