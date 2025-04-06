package com.subh.movie.RequestDto;

import java.util.List;

import lombok.Data;

@Data
public class MovieInfoDto {
    private String title;
    private String genre;
    private List<TheaterDto> theaters;
}


