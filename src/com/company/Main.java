package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Dog").print();
        createObject("Cat").print();
        createObject("Rabbit").print();
    }

    public static Printable createObject(String className) {
        Printable printable = null;
        switch (className) {
            case "Dog":
                printable = new Dog("Lucky", 2, "Бульдог");
                break;
            case "Cat":
                printable = new Cat("Meni", 6, 13);
                break;
            case "Rabbit":
                printable = new Rabbit("Chaki", 1, 50);
                break;
        }
        return printable;
    }
}
