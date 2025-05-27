package com.example.project.service;

import com.example.project.model.Booking;
import com.example.project.repository.Bookingrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private  Bookingrepo bookingrepo;

    public Booking saveBooking(Booking booking) {
        return bookingrepo.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingrepo.findAll();
    }

    public Optional<Booking> getBookingById(Long id) {
        return bookingrepo.findById(id);
    }

    public void deleteBooking(Long id) {
        bookingrepo.deleteById(id);
    }
}
