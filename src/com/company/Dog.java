package com.company;

public class Dog extends Animal implements Printable{
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void print() {
        System.out.println(getName() + " " + getAge() + " " + getBreed());
    }
}
