package com.greenfoxacademy.rest.Model;

public class Doubling {
    private Integer received;
    private Integer result;

    public Doubling(Integer received) {
        this.received = received;
        result = received *2;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
