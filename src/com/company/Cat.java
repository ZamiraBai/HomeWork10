package com.company;

public class Cat extends Animal implements Printable{
    private int weight;

    public Cat(String name, int age, int weight) {
        super(name, age); this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void print() {
        System.out.println(getName() + " " + getAge() + " " + getWeight());
    }
}
