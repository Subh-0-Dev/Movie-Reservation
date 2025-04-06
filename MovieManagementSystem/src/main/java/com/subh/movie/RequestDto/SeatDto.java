package com.subh.movie.RequestDto;

import com.subh.movie.Entities.FixshowTime;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class SeatDto {
	private String seatRow;
    private int seatCol;
    
    private FixshowTime showtime;
}
