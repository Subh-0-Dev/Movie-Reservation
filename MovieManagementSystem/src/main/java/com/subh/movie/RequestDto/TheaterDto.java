package com.subh.movie.RequestDto;

import java.util.List;

import lombok.Data;

@Data
public class TheaterDto {
    private String name;
    private String location;
    private List<ShowtimeDto> showtimes;
}