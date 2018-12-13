package com.hellobeanworld.excercises.Models;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Green implements MyColor {
    @Autowired
    Printer printer;

    @Override
    public void printColor() {
        printer.log("It is green in color...");
    }
}
