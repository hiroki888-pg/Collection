package practice;

import java.time.LocalDate;

public class Task {
	
	LocalDate date;
	String schedule;
	
	public Task(LocalDate date, String schedule) {
		this.date = date;
		this.schedule = schedule;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public LocalDate getDate() {
		return this.date;
	}
	
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	public String getSchedule() {
		return this.schedule;
	}

}