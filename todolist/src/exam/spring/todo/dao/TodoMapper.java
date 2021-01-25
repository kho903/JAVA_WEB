package exam.spring.todo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import exam.spring.todo.dto.TodoList;

@Mapper
public interface TodoMapper {

	public List<TodoList> getTodo();

	public void deleteTodo();

	public void changeStatusTodo();

	public void updateTodo();

	public int addTodo(TodoList todoList);
}
