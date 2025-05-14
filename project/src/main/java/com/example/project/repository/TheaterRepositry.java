package com.example.project.repository;


import com.example.project.model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.project.model.Theater;

import java.util.List;
import java.util.Optional;

public  interface TheaterRepositry extends JpaRepository<Theater, Integer> {

    List<Theater> findById(int id);
}
