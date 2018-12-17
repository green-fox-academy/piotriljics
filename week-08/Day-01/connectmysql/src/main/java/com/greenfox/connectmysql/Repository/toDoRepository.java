package com.greenfox.connectmysql.Repository;

import com.greenfox.connectmysql.Model.ToDo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface toDoRepository extends CrudRepository<ToDo, Long>{
    List<ToDo> findByDone(Boolean b);
}
