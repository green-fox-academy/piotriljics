package com.greenfoxacademy.tourist;

import com.greenfoxacademy.tourist.Model.Attraction;
import com.greenfoxacademy.tourist.Repository.MyRepository;
import com.greenfoxacademy.tourist.Service.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TouristApplication {
    public static void main(String[] args) {

        SpringApplication.run(TouristApplication.class, args);
    }
}

