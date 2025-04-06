package com.subh.movie.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.subh.movie.RequestDto.BookingDto;

@Service
public interface BookingService {
	public ResponseEntity<?> bookTicket(BookingDto request);
	public ResponseEntity<?> getMovies();
	public ResponseEntity<?> getTheaters(Long movieId);
	public ResponseEntity<?> getShowtimes(Long movieId, Long TheaterId);
}
