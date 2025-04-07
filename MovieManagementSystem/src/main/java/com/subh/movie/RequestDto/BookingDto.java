package com.subh.movie.RequestDto;

import java.util.List;

import lombok.Data;

@Data
public class BookingDto {
	private String name;
    
    private String movieName;
    
    private String theaterName;
    
    private List<SeatDto> seats;
}
