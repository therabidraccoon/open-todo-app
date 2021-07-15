package it.si2001.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.si2001.todo.domain.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
