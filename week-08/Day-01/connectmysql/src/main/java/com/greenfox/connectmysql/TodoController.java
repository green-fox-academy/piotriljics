package com.greenfox.connectmysql;


import com.greenfox.connectmysql.Model.ToDo;
import com.greenfox.connectmysql.Repository.toDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private toDoRepository myRepository;

    @Autowired
    public TodoController (toDoRepository myRepository){
        this.myRepository = myRepository;
    }

    @GetMapping(value ={"","/","/list"})
    public String list(Model model, @RequestParam(name="isActive", required = false)Boolean isActive,
                       @RequestParam(name="searchText", required = false) String search) {
        if (search != null) {
            model.addAttribute("todos", myRepository.findAllByTitle(search));
        }
        else if(isActive == null) {
            model.addAttribute("todos", myRepository.findAll());
        }else if (isActive) {
            model.addAttribute("todos",myRepository.findByDone(!isActive));
        }
        return "ToDoList";
    }
    @GetMapping("/add")
    public String getInput(Model model, @ModelAttribute(name="todo") ToDo todo) {
        model.addAttribute("todo", todo);
        return "ToDoAdd";
    }
    @PostMapping("/add")
    public String addInput(@ModelAttribute(name = "todo") ToDo todo) {
        myRepository.save(todo);
        return "redirect:/todo/list";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id){
        myRepository.deleteById(id);
        return "redirect:/todo/list";
    }
    @GetMapping("/{id}/edit")
    public String editGet(@PathVariable Long id, Model model){
        model.addAttribute("modelEdit", myRepository.findById(id).get());
        return "ToDoEdit";
    }
    @PostMapping("/edit")
    public String editPost(@ModelAttribute (name = "modelEdit") ToDo toDo){
        myRepository.save(toDo);
        return "redirect:list";
    }
}
