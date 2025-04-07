package com.subh.movie.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.subh.movie.Entities.FixshowTime;
import com.subh.movie.RequestDto.BookingDto;

@Service
public interface BookingService {
	public ResponseEntity<?> bookTicket(BookingDto request);
	public ResponseEntity<?> getMovies();
	public List<?> getBookedSeat(Long movieId,Long theaterId, FixshowTime showtime);
}
