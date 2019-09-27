package com.company;

public class Rabbit extends Animal implements Printable {
    private int speed;

    public Rabbit(String name, int age, int speed) {
        super(name, age); this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void print() {
        System.out.println(getName() + " " + getAge() + " " + getSpeed());
    }
}
