package com.greenfoxacademy.rest.Model;

public class DoUntil {
    private Integer until;

    public DoUntil() {
    }

    public DoUntil(Integer until) {
        this.until = until;
    }

    public DoUntil sum(){
        Integer sum = 0;
        for (int i = 1; i <= until; i++) {
            sum += i;
        }
        return new DoUntil(sum);
    }
    public DoUntil factor(){
        Integer factor = 1;
        for (int i = 1; i <= until; i++) {
            factor *= i;
        }
        return new DoUntil(factor);
    }

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }
}
