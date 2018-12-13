package com.hellobeanworld.excercises.Models;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class Red implements MyColor {
    @Autowired
    Printer printer;

    @Override
    public void printColor() {
        printer.log("It is red in color...");
    }
}
