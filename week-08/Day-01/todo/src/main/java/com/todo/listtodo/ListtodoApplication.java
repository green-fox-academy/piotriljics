package com.todo.listtodo;

import com.todo.listtodo.Model.ToDo;
import com.todo.listtodo.Repository.toDoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListtodoApplication implements CommandLineRunner {

    private toDoRepository toDoRepository;

    public ListtodoApplication(toDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ListtodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        toDoRepository.save(new ToDo("I have to learn Object Relational Mapping"));
        toDoRepository.save(new ToDo("Or tried :("));
    }
}

