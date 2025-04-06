package com.subh.movie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subh.movie.Entities.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Long>{
	
}
