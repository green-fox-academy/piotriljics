package com.bankofsimba.demobank;

public class BankAccount {
    private String name;
    private int balance;
    private String animalType;
    private boolean isKing;


    public BankAccount(String name, int balance, String animalType, boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
