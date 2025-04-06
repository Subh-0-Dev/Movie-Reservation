package com.subh.movie.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.subh.movie.Entities.Showtime;


public interface ShowtimeRepository extends JpaRepository<Showtime, Long>{

}
