package com.greenfoxacademy.rest.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfoxacademy.rest.Model.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class RRRestController {
    @GetMapping("/doubling")
    Object doubling(@RequestParam(required = false) Integer input) {
        if (input != null) {
            return new Doubling(input);
        } else {
            return new ErrorMessage("Please provide an input!");
        }
    }

    @GetMapping("/greeter")
    Object greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null && title == null) {
            return new ErrorMessage("Please provide a name and a title!");
        } else if (title == null) {
            return new ErrorMessage("Please provide a title!");
        } else if (name == null) {
            return new ErrorMessage("Please provide a name!");
        } else {
            return new Greeter(name, title);
        }
    }

    @GetMapping("/appenda/{appendable}")
    Object appendA(@PathVariable String appendable) {
        if (appendable != null) {
            return new AppendA(appendable);
        } else {
            return new ErrorMessage("404");
        }
    }
    @PostMapping("/dountil/{action}")
    Object doUntil(@PathVariable String action, @RequestBody DoUntil until){
        if (until == null) {
            return new ErrorMessage("Please provide a number!");
        } else if(action.equals("sum")){
            return until.sum();
        } else if (action.equals("factor")){
            return until.factor();
        }
        return new ErrorMessage("Please provide a number!");
    }
}

   /* @GetMapping("/doubling")
    @ResponseBody
    String doubling(@RequestParam ("input") Integer input) throws JsonProcessingException {
        ObjectMapper mapper =new ObjectMapper();
        Doubling doubling = new Doubling(input);
        String jason = mapper.writeValueAsString(doubling);
        return jason;
    }*/
