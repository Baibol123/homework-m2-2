package org.example;

public class Phone extends Tech{
    private String model;
    private int year;
    private String power;

    public Phone(String name, String model, int year, String power) {
        super(name);
        this.model = model;
        this.year = year;
        this.power = power;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Phone power: " + power + " model: "+ model + " year: " + year);
    }
}
