package com.greenfoxacademy.mysqltodo.services;

import com.greenfoxacademy.mysqltodo.models.Todo;
import com.greenfoxacademy.mysqltodo.respositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{
  
  private TodoRepository todoRepository;
  
  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }
  
  @Override
  public List<Todo> getTodoList() {
    List<Todo> todos = new ArrayList<>();
    todoRepository
        .findAll()
        .forEach(todos::add);
    
    return todos;
  }
}
