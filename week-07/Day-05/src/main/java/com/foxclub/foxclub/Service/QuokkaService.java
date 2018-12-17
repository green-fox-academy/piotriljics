package com.foxclub.foxclub.Service;
import com.foxclub.foxclub.Model.Quokka;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuokkaService {
    private List<Quokka> myList;

    public QuokkaService() {
        myList = new ArrayList<>();
        myList.add(new Quokka("bobby"));
    }
    public List<Quokka> getMyList() {
        return myList;
    }
    public void add(String name){
        myList.add(new Quokka(name));
    }
    public void feed(){}
}
