package com.subh.movie.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
	public ResponseEntity<?> getMovies();
	public ResponseEntity<?> getTheaters();
	public ResponseEntity<?> getShowtimes();
}
