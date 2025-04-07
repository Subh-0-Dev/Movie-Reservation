package com.subh.movie.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.subh.movie.Entities.Booking;
import com.subh.movie.Entities.FixshowTime;
import com.subh.movie.Entities.Seats;

@Repository
public interface SeatRepository extends JpaRepository<Seats, Long>{
	
	List<Seats> findByShowtimeAndSeatRowAndSeatCol(FixshowTime showtime, String seatRow, int seatCol);
	@Query("SELECT CONCAT(s.seatRow, s.seatCol) FROM Seats s WHERE s.movieId = :movieId AND s.theaterId = :theaterId AND s.showtime = :showtime")
	List<String> findByMovieIdAndTheaterIdAndShowtime(@Param("movieId") Long movieId,
	                                                  @Param("theaterId") Long theaterId,
	                                                  @Param("showtime") FixshowTime showtime);

}
