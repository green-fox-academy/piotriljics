package com.foxclub.foxclub.Repository;

import com.foxclub.foxclub.Model.Quokka;
import org.springframework.data.repository.CrudRepository;

public interface QuokkaRepository extends CrudRepository<Quokka, String> {
    Quokka findByName (String name);
}
