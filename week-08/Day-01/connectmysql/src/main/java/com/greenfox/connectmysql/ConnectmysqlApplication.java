package com.greenfox.connectmysql;


import com.greenfox.connectmysql.Model.Assignee;
import com.greenfox.connectmysql.Model.ToDo;
import com.greenfox.connectmysql.Repository.toDoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ConnectmysqlApplication implements CommandLineRunner {

    private toDoRepository toDoRepository;
    private List<Assignee> assignees;

    public ConnectmysqlApplication(toDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConnectmysqlApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        toDoRepository.save(new ToDo("Study", true, false));
        toDoRepository.save(new ToDo("Eat", false, false));
        toDoRepository.save(new ToDo("Clean the flat", true, false));
        toDoRepository.save(new ToDo("Play guitar", false, true));
        toDoRepository.save(new ToDo("Do the shopping", true, true));
        toDoRepository.save(new ToDo("Rest", false, true));
        toDoRepository.save(new ToDo("Smoke", true, true));
    }
}