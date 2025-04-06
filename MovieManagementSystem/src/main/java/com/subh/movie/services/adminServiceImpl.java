package com.subh.movie.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subh.movie.Entities.Movie;
import com.subh.movie.Entities.Seats;
import com.subh.movie.Entities.Showtime;
import com.subh.movie.Entities.Theater;
import com.subh.movie.RequestDto.MovieInfoDto;
import com.subh.movie.RequestDto.MovieResponseDto;
import com.subh.movie.RequestDto.ShowtimeDto;
import com.subh.movie.RequestDto.TheaterDto;
import com.subh.movie.repository.MovieRepository;


import lombok.RequiredArgsConstructor;

public class adminServiceImpl implements AdminService{
	
	@Autowired
    private MovieRepository movieRepository;

    
    public String addMovieInfo(MovieInfoDto movieInfo) {
    	Movie movie=new Movie();
    	
    	movie.setTitle(movieInfo.getTitle());
    	movie.setGenre(movieInfo.getGenre());
    	
    	List<Theater> theaterList=new ArrayList<>();
    	for(TheaterDto theaterDto:movieInfo.getTheaters()) {
    		Theater theater=new Theater();
    		theater.setName(theaterDto.getName());
    		theater.setLocation(theaterDto.getLocation());
    		
    		theater.setMovie(movie);
    		
    		List<Showtime> showtimes = new ArrayList<>();
            for (ShowtimeDto showtimeDto : theaterDto.getShowtimes()) {
                Showtime showtime = new Showtime();
                showtime.setShowtime(showtimeDto.getShowtime()); // Enum
                showtime.setTheater(theater);
                showtimes.add(showtime);
            }
            theater.setShowtimes(showtimes);
            theaterList.add(theater);
    	}
    	movie.setTheater(theaterList);
    	
    	movieRepository.save(movie);
		return "Added Successfully";
    	
    }
}
