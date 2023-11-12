package org.example;

public abstract class Tech implements Printable{
    private String name;

    public Tech(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void print() {
        System.out.println("tech: " + name);
    }
//    public abstract Printable createObject();

}
