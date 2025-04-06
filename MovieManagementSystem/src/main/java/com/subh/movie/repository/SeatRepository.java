package com.subh.movie.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subh.movie.Entities.Booking;
import com.subh.movie.Entities.FixshowTime;
import com.subh.movie.Entities.Seats;

@Repository
public interface SeatRepository extends JpaRepository<Seats, Long>{
	
	List<Seats> findByShowtimeAndSeatRowAndSeatCol(FixshowTime showtime, String seatRow, int seatCol);
}
