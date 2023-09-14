package com.javaStudies.springboot.myfirstwebapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
	private TodoService todoService;
	public TodoController(TodoService todoService) {
		this.todoService = todoService;
	}
	@GetMapping("list-todo")
	public String listTodos(ModelMap model){
		model.put("todos", todoService.findByUsername());
		return "todo/todos";
	}
}
