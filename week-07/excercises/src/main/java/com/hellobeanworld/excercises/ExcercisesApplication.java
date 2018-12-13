package com.hellobeanworld.excercises;

import com.hellobeanworld.excercises.Models.Printer;
import com.hellobeanworld.excercises.Models.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ExcercisesApplication implements CommandLineRunner {
    Printer printer;
    MyColor myColor;

    @Autowired
    public ExcercisesApplication(Printer printer, MyColor myColor) {
        this.printer = printer;
        this.myColor = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(ExcercisesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        myColor.printColor();
        printer.log("hello");
    }
}

