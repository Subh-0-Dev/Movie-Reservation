package com.subh.movie.services;

import java.lang.annotation.Documented;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.subh.movie.Entities.Movie;
import com.subh.movie.RequestDto.MovieInfoDto;
import com.subh.movie.RequestDto.MovieResponseDto;
import com.subh.movie.RequestDto.ShowtimeResponseDto;
import com.subh.movie.RequestDto.TheaterResponseDto;
import com.subh.movie.repository.MovieRepository;
import com.subh.movie.repository.ShowtimeRepository;
import com.subh.movie.repository.TheaterRepository;

public class UserServiceImpl implements UserService{
	
	@Autowired
	MovieRepository movieRepository;
	@Autowired
	TheaterRepository theaterRepository;
	@Autowired
	ShowtimeRepository showtimeRepository;
	
	
	
	@Override
	public ResponseEntity<?> getMovies() {
		
		List<MovieResponseDto> response = movieRepository.findAll()
				.stream()
				.map(e -> new MovieResponseDto(
						e.getId(), 
						e.getTitle(), 
						e.getGenre()
					)).collect(Collectors.toList());

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getTheaters() {
		List<TheaterResponseDto> response= theaterRepository.findAll()
				.stream().map(e -> new TheaterResponseDto(
						e.getId(),
						e.getName(),
						e.getLocation()
				)).collect(Collectors.toList());
		
		return new ResponseEntity<>(response,HttpStatus.FOUND);
	}

	@Override
	public ResponseEntity<?> getShowtimes() {
		List<ShowtimeResponseDto> response= showtimeRepository.findAll()
				.stream().map(e -> new ShowtimeResponseDto(
						e.getId(),
						e.getShowtime()
				)).collect(Collectors.toList());
		
		return new ResponseEntity<>(response,HttpStatus.FOUND);
	}
}
