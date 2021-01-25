package exam.spring.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import exam.spring.todo.dao.TodoMapper;
import exam.spring.todo.dto.TodoList;

@Service
public class TodoService {
	@Autowired
	private TodoMapper todoMapper;
	
	@Transactional(readOnly = true)
	public List<TodoList> getTodo(){
		return todoMapper.getTodo();
	}
	
	public int addTodo(TodoList todo) {
		return todoMapper.addTodo(todo);
	}
}
