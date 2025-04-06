package com.subh.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subh.movie.RequestDto.BookingDto;
import com.subh.movie.services.BookingService;

@RestController
@RequestMapping("/user")
public class BookingController {
	
	@Autowired
	private BookingService bookingService; 
	
	@PostMapping("/booking")
	public ResponseEntity<?> bookMovie(@RequestBody BookingDto bookRequest){
		
		if(bookRequest !=null) {
			return new ResponseEntity<>(bookingService.bookTicket(bookRequest),HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<>("No data here",HttpStatus.CONFLICT);
		}
		
	}
	
	@GetMapping("/booking/movies")
	public ResponseEntity<?> getAllMovies(){
		return bookingService.getMovies();
	}
}
