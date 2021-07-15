package it.si2001.todo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.si2001.todo.domain.Todo;
import it.si2001.todo.service.TodoService;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

	private static final Logger logger = LoggerFactory.getLogger(TodoController.class);

	@Autowired
	private TodoService todoSrv;

	@GetMapping("/list")
	public ResponseEntity<List<Todo>> findAll() {
		logger.info("--- Service TODO findAll request received ---");
		List<Todo> todos = todoSrv.findAll();
		return ResponseEntity.ok(todos);
	}

	@PutMapping("/save")
	public ResponseEntity<Todo> save(@RequestBody Todo todo) {
		logger.info("--- Service TODO save request received ---");
		Todo t = todoSrv.save(todo);
		return ResponseEntity.ok(t);
	}

}
