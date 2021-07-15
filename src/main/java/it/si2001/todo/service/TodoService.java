package it.si2001.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.si2001.todo.domain.Todo;
import it.si2001.todo.repository.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository todoRepo;
	
	public List<Todo> findAll() {
		return todoRepo.findAll();
	}
	
	public Todo save(Todo t) {
		return todoRepo.save(t);
	}

}
