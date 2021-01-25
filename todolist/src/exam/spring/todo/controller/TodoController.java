package exam.spring.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import exam.spring.todo.service.TodoService;

@Controller
@RequestMapping("/todo")
public class TodoController {
	@Autowired
	private TodoService todoService;
	
	@GetMapping
	public String getTodo(ModelMap model){
		model.addAttribute("todo", todoService.getTodo());
		return "todo/view";
	}
}
