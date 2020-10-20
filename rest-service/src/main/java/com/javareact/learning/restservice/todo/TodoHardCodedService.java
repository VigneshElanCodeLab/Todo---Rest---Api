package com.javareact.learning.restservice.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardCodedService {
	private static List<Todo> todos = new ArrayList();

	private static int idCounter = 0;

	static {
		todos.add(new Todo(++idCounter, "Vignesh", "Learning", new Date(), false));
		todos.add(new Todo(++idCounter, "Vignesh", "React", new Date(), false));
		todos.add(new Todo(++idCounter, "Vignesh", "Java", new Date(), false));

	}

	public List<Todo> findAll() {
		return todos;
	}

	public Todo deleteById(long id) {
		Todo todo = findById(id);
		if(todo==null) return null;
				todos.remove(todo);
				return todo;
	}
	public Todo save(Todo todo ) {
	if(todo.getId()==-1 || todo.getId()==0) {
		todo.setId(++idCounter);
	
		todos.add(todo);
	}else {
		deleteById(todo.getId());
	todos.add(todo);
	System.out.print(todo);
	}
	return todo;
	}
	public Todo findById(long id) {
		for (Todo todo : todos) {
			if (todo.getId() == id) {
				return todo;
			}

		}
		return null;
	}

}
