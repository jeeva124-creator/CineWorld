package com.example.project.repository;
import  com.example.project.model.Cast;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CastRepository extends JpaRepository<Cast, Long> {
    Cast findCastById(Long Costid);

    Optional<Cast> findById(Integer id);

}
