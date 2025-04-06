package com.subh.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.subh.movie.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/movies")
	public ResponseEntity<?> moviesavailable(){
		return userService.getMovies();
	}
	
	@GetMapping("/theaters")
	public ResponseEntity<?> theateravailable(){
		return userService.getTheaters();
	}
	
	@GetMapping("/showtimes")
	public ResponseEntity<?> showtimeavailable(){
		return userService.getShowtimes();
	}
}
