package com.greenfoxacademy.rest.Model;

public class Greeter {
    private String name;
    private String title;
    private String welcome_message;

    public Greeter(String name, String title) {
        this.name = name;
        this.title = title;
        this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
