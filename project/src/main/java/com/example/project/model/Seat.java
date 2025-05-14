package com.example.project.model;

import jakarta.persistence.*;


import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter

public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rowLabel;
    private int columnNumber;


    private String seatType;

    private boolean booked;


    @Column(name = "show_id")
    private Long showId;

    public Long getShowId() {
        return showId;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
    }

    public String getSeatType() {
        return seatType;
    }

    public String getRowLabel() {
        return rowLabel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public int getColumnNumber() {
        return columnNumber;
    }


    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public void setRowLabel(String row) {
        this.rowLabel=row;
    }

    public void setColumnNumber(int cal) {
        this.columnNumber=cal;
    }

    public void setSeatType(String REGULAR) {
        this.seatType=REGULAR;
    }

}
