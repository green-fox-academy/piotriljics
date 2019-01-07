package com.foxclub.foxclub.Service;
import com.foxclub.foxclub.Model.Quokka;
import com.foxclub.foxclub.Repository.QuokkaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuokkaService {
    QuokkaRepository quokkaRepository;

    @Autowired
    public QuokkaService(QuokkaRepository quokkaRepository) {
        this.quokkaRepository = quokkaRepository;
    }

    public void saveQuokka(Quokka quokka){
        quokkaRepository.save(quokka);
    }

    public Optional<Quokka> findQuokka(String name) {
        for (Quokka quokka : quokkaRepository.findAll()) {
            if (quokka.getName().equals(name)) {
                return Optional.of(quokka);
            }
        }
        return Optional.empty();
    }


    /*   private List<Quokka> myList;

        public QuokkaService() {
            myList = new ArrayList<>();
            myList.add(new Quokka("bobby"));
        }
        public List<Quokka> getMyList() {
            return myList;
        }
     public void add(String name){
        myList.add(new Quokka(name));
    }*/
}
