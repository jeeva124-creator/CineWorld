package com.example.project.model;

import jakarta.persistence.*;

@Entity
@Table(name="booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private  String username;


    private String showtime;

//    private String

    @ManyToOne
    private  long showid;




}
