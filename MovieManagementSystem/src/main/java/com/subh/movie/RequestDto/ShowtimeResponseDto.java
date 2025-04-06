package com.subh.movie.RequestDto;

import com.subh.movie.Entities.FixshowTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ShowtimeResponseDto {
	private Long id;
	private FixshowTime showtime;
}
