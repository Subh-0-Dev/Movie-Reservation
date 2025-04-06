package com.subh.movie.services;

import org.springframework.stereotype.Service;

import com.subh.movie.RequestDto.MovieInfoDto;

@Service
public interface AdminService {
	public String addMovieInfo(MovieInfoDto movieInfo);
}
