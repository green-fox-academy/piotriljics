package com.greenfoxacademy.tourist.Service;

import com.greenfoxacademy.tourist.Model.Attraction;
import com.greenfoxacademy.tourist.Repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class AttractionService {
    private MyRepository myRepository;

    @Autowired
    public AttractionService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public List<Attraction> listAllAttractions() {
        return myRepository.findAll();
    }

    public void addAttraction(Attraction attraction) {
        myRepository.save(attraction);
    }

    public Attraction findById(Long id) {
        return myRepository.findById(id).get();
    }

    public Attraction findCheapest(String category) {
        return myRepository.findTop1ByCategoryIsOrderByPrice(category);
    }
    public List<Attraction> listCheapest(){
        List<Attraction> cheapest = new ArrayList<>();
        cheapest.add(findCheapest("restaurant"));
        cheapest.add(findCheapest("park"));
        cheapest.add(findCheapest("museum"));
        return cheapest;
    }

}
