package com.subh.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subh.movie.RequestDto.MovieInfoDto;
import com.subh.movie.services.AdminService;

@CrossOrigin(origins = "http://localhost:5500")
@RestController
@RequestMapping("/admin")
public class adminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/add")
	public ResponseEntity<String> saveMovie(@RequestBody MovieInfoDto movieInfo){
		if(movieInfo != null) {
			adminService.addMovieInfo(movieInfo);
		}
		return new ResponseEntity<String>("Movie added",HttpStatus.ACCEPTED);
	}
    
}
