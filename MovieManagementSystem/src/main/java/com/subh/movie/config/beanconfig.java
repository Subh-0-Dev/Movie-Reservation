package com.subh.movie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.subh.movie.services.AdminService;
import com.subh.movie.services.BookingService;
import com.subh.movie.services.BookingServiceImpl;
import com.subh.movie.services.UserService;
import com.subh.movie.services.UserServiceImpl;
import com.subh.movie.services.adminServiceImpl;

@Configuration
public class beanconfig {
	@Bean
	public AdminService getadmin() {
		return new adminServiceImpl();
	}
	
	@Bean
	public BookingService getbooked() {
		return new BookingServiceImpl();
	}
	
	@Bean
	public UserService getDetails() {
		return new UserServiceImpl();
	}
}
