package com.subh.movie.RequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TheaterResponseDto{
	private Long id;
	private String name;
    private String location;

}
