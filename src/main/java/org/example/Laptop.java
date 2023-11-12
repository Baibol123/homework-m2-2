package org.example;

public class Laptop extends Tech{
    private int year;
    private String model;
    private String power;

    public Laptop(String name, int year, String model, String power) {
        super(name);
        this.year = year;
        this.model = model;
        this.power = power;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Laptop power: " + power + " model: "+ model + " year: " + year);
    }
}
