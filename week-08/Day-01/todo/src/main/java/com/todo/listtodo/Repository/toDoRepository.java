package com.todo.listtodo.Repository;

import com.todo.listtodo.Model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface toDoRepository extends CrudRepository<ToDo, Long>{

}
