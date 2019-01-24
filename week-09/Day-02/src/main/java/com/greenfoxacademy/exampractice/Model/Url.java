package com.greenfoxacademy.exampractice.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Url {


    @Id
    @NotNull
    @NotEmpty
    private String inputAlias;
    @NotNull
    @NotEmpty
    private String input;
    @JsonIgnore
    private String secretCode;
    private Integer hitCount;

    public Url() {
        hitCount = 0;
    }

    public Url(String input, String inputAlias, String secretCode) {
        this.input = input;
        this.inputAlias = inputAlias;
        hitCount = 0;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInputAlias() {
        return inputAlias;
    }

    public void setInputAlias(String inputAlias) {
        this.inputAlias = inputAlias;
    }

    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    public Integer getHitCount() {
        return hitCount;
    }

    public void increaseHitCount() {
        hitCount++;
    }
}
