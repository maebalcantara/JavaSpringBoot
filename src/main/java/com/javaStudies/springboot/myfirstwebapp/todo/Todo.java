package com.javaStudies.springboot.myfirstwebapp.todo;

import java.time.LocalDate;


//to store in database
//for now: create static list of todos
public class Todo {
	private int id;
	private String username;
	private String desc;
	private LocalDate targetDate;
	private boolean isDone;
	public Todo(int id, String username, String desc, LocalDate targetDate,
			boolean isDone) {
		this.id = id;
		this.username = username;
		this.desc = desc;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public LocalDate getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}
	public boolean getisDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	
	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", desc=" + desc
				+ ", targetDate=" + targetDate + ", isDone=" + isDone + "]";
	}
}
