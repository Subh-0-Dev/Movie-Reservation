package com.subh.movie.RequestDto;

import java.util.List;

import lombok.Data;

@Data
public class BookingDto {
	private String name;
    private Long movieId;
    private String movieName;
    private Long theaterId;
    private String theaterName;
    
    private List<SeatDto> seats;
}
