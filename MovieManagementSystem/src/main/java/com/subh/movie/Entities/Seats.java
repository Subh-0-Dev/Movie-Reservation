package com.subh.movie.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Seats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String seatRow;
    private int seatCol;
    
    @Enumerated(EnumType.STRING)
    private FixshowTime showtime;
    
    @ManyToOne
    @JoinColumn(name = "bookingId")
    @JsonIgnore
    private Booking bookings;
    

}
