package com.subh.movie.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.subh.movie.Entities.Booking;
import com.subh.movie.Entities.Seats;
import com.subh.movie.RequestDto.BookingDto;
import com.subh.movie.RequestDto.SeatDto;
import com.subh.movie.repository.BookingRepository;
import com.subh.movie.repository.MovieRepository;
import com.subh.movie.repository.SeatRepository;

public class BookingServiceImpl implements BookingService{
	
	@Autowired
	BookingRepository bookingRepository;
	@Autowired
	SeatRepository seatRepository;
	@Autowired
	MovieRepository movieRepository;
	
	@Override
	public ResponseEntity<?> bookTicket(BookingDto request) {
		Booking booking=new Booking();
		
		booking.setMovieId(request.getMovieId());
		booking.setMovieName(request.getMovieName());
		booking.setName(request.getName());
		booking.setTheaterId(request.getTheaterId());
		booking.setTheaterName(request.getTheaterName());
		
		
		List<Seats> seatList=new ArrayList<>();
		for(SeatDto seatData:request.getSeats()) {
			Seats seatDto=new Seats();
				if(seatRepository.findByShowtimeAndSeatRowAndSeatCol(seatData.getShowtime(),seatData.getSeatRow(), seatData.getSeatCol()).isEmpty()) {
					seatDto.setSeatRow(seatData.getSeatRow());
					seatDto.setSeatCol(seatData.getSeatCol());
					seatDto.setShowtime(seatData.getShowtime());
					
					seatDto.setBookings(booking);
				}else {
					return new ResponseEntity<>("Seat is Taken",HttpStatus.NO_CONTENT);
				}
				
			
			seatList.add(seatDto);
		}
		booking.setSeats(seatList);
		
		return new ResponseEntity<>(bookingRepository.save(booking),HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<?> getMovies() {
		
		return new ResponseEntity<>(movieRepository.findAll(),HttpStatus.FOUND);
	}

	@Override
	public ResponseEntity<?> getTheaters(Long movieId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> getShowtimes(Long movieId, Long TheaterId) {
		// TODO Auto-generated method stub
		return null;
	}

}
