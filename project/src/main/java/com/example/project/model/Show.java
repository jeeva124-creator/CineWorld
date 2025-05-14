package com.example.project.model;

import jakarta.persistence.*;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Table(name = "shows")
@Entity

public class Show {

    @Id
    private Long id;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Theater theater;


    private LocalDateTime showTime;

    private LocalDate showdate;

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getShowTimes() {
        return showTimes;
    }

    public void setShowTimes(List<String> showTimes) {
        this.showTimes = showTimes;
    }

    private List<String> showTimes;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public LocalDateTime getShowTime() {
        return showTime;
    }

    public void setShowTime(LocalDateTime showTime) {
        this.showTime = showTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }


    public LocalDate getShowdate() {
        return showdate;
    }

    public void setShowdate(LocalDate showdate) {
        this.showdate = showdate;
    }



}


