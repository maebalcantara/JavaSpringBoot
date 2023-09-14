package com.javaStudies.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	private static int id;
	static {
		todos.add(new Todo(++id, "mae", "First To-do of mae", LocalDate.parse("2023-08-08"), true));
		todos.add(new Todo(++id, "mae", "Second To-do of mae", LocalDate.parse("2023-09-12"), true));
		todos.add(new Todo(++id, "itoy", "First To-do of itoy", LocalDate.parse("2022-01-08"), true));
		todos.add(new Todo(++id, "andrew", "First To-do of andrew", LocalDate.parse("2023-04-02"), true));
	}
	
	public List<Todo> findByUsername(){
		return todos;
	}
}
