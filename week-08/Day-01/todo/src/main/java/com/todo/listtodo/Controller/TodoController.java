package com.todo.listtodo.Controller;

import com.todo.listtodo.Repository.toDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private toDoRepository myRepository;

    @Autowired
    public TodoController (toDoRepository myRepository){
        this.myRepository = myRepository;
    }

    @RequestMapping (value = {"/", "/list"}, method = GET)
    public String list(Model model) {
        model.addAttribute("todos", myRepository.findAll());
        return "ToDoList";
    }
}
