package com.example.project.repository;

import com.example.project.model.Booking;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;




@Repository
public interface Bookingrepo  extends JpaRepository<Booking,Long> {


}
