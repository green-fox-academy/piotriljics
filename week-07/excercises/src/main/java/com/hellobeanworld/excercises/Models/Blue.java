package com.hellobeanworld.excercises.Models;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class Blue implements MyColor {
    @Autowired
    Printer printer;

    @Override
    public void printColor() {
        printer.log("It is blue in color...");
    }
}
