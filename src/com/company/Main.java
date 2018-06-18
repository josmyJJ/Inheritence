package com.company;

public class Main {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.sleep();
        System.out.println("------------------");

        Cat c = new Cat();
        c.eat();
        c.sleep();
        System.out.println("------------------");

        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}
