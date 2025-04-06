package com.subh.movie.Entities;

import lombok.Getter;

@Getter
public enum FixshowTime {
	MORNING("09:00"),
    AFTERNOON("12:30"),
    EVENING("16:00"),
    NIGHT("19:30");
	
	private final String time;
	
	FixshowTime(String time) {
		this.time=time;
	}
	 
	public String getTime() {
        return time;
    }
	
}
