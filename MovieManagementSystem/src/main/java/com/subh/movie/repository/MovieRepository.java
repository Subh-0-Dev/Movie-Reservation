package com.subh.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subh.movie.Entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
