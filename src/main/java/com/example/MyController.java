package com.example;

import com.example.model.ToDoDAO;
import com.example.model.ToDoDTO;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.mvc.Controller;
import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import lombok.NoArgsConstructor;

@Controller
@RequestScoped
@NoArgsConstructor(force = true)
@Path("/")
public class MyController {
	private final ToDoDAO toDoDAO;

	@Inject
	public MyController(ToDoDAO toDoDAO) {
		this.toDoDAO = toDoDAO;
	}

	@GET
	@Path("list")
	public String getToDo() {
		toDoDAO.getAll();
		return "todo.jsp";
	}

	@POST
	@Path("list")
	public String postToDo(@BeanParam ToDoDTO toDo) {
		toDoDAO.create(toDo);
		return "redirect:list";
	}

	@GET
	@Path("clear")
	public String clearToDo() {
		toDoDAO.deleteAll();
		return "redirect:list";
	}
}
