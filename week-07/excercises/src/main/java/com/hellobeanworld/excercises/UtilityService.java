package com.hellobeanworld.excercises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;


@Service
public class UtilityService {

    ArrayList<String> colors;
    Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public boolean emailValidator(String string){
        return (string.contains("@") && string.contains("."));
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }
}