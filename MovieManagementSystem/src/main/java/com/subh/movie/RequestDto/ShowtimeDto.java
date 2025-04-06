package com.subh.movie.RequestDto;

import com.subh.movie.Entities.FixshowTime;
import lombok.Data;

@Data
public class ShowtimeDto {
    private FixshowTime showtime; // Enum: MORNING, AFTERNOON, etc.
}
