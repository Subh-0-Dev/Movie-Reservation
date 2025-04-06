package com.subh.movie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subh.movie.Entities.Booking;
import com.subh.movie.Entities.FixshowTime;

public interface BookingRepository extends JpaRepository<Booking, Long>{
	
}
