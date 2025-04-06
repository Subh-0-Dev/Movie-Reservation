package com.subh.movie.RequestDto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MovieResponseDto {
	private Long id;
    private String title;
    private String genre;

}
