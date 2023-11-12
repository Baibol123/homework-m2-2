package org.example;

public class Main {
    public static void main(String[] args) {
//        Laptop laptop = new Laptop("Asus", 2023, "rog scar", "powerful");
//        Pad pad = new Pad("iPad", 2022, "Air", "average power");
//        Phone phone = new Phone("IPhone", "7", 2016,"weak power");
        Main main = new Main();
        Printable printable2 = main.createObject("2й");
        Printable printable3 = main.createObject("3й");
        Printable printable4 = main.createObject("4й");

        Printable[] printables = {printable2, printable3, printable4};

        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
        }

    }
    public Printable createObject(String className) {
        switch (className) {
            case "2й":
                return new Laptop("Asus", 2023, "rog scar", "powerful");
            case "3й":
                return new Pad("iPad", 2022, "Air", "average power");
            case "4й":
                return new Phone("IPhone", "7", 2016, "weak power");
            default:
                return null;
        }
    }
}