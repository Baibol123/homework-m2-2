package org.example;

public class Pad extends Tech{
    private int year;
    private String model;
    private String power;

    public Pad(String name, int year, String model, String power) {
        super(name);
        this.year = year;
        this.model = model;
        this.power = power;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Pad power: " + power + " model: "+ model + " year: " + year);
    }
}
