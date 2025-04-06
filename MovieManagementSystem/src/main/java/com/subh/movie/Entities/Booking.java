package com.subh.movie.Entities;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    private String name;
    private Long movieId;
    private String movieName;
    private Long theaterId;
    private String theaterName;
    
    
    @OneToMany(mappedBy = "bookings", cascade = CascadeType.ALL)
    
    private List<Seats> seats;

}
