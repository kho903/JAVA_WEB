package exam.spring.todo.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import exam.spring.todo.config.ApplicationConfig;
import exam.spring.todo.dto.TodoList;
import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ApplicationConfig.class })
public class TodoMapperTest {
	@Autowired
	private TodoMapper todoMapper;
	
	@Test
	public void addTodo() throws Exception {
		TodoList todo = new TodoList();
		todo.setNum(2);
		todo.setStatus(0);
		todo.setTodo("할꺼많돵ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ");
		todoMapper.addTodo(todo);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getTodo() throws Exception{
		List<TodoList> todoList = todoMapper.getTodo();
		Assert.assertEquals(1, todoList.size());
	}
}
