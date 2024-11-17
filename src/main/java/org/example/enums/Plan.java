package org.example.enums;

public enum Plan {
    BASIC("Basic Plan", 100.0),
    PREMIUM("Premium Plan", 200.0),
    FAMILY("Family Plan", 300.0);

    private String name;
    private double price;


    Plan(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
