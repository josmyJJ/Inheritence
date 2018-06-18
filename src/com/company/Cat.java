package com.company;

public class Cat extends Animal{

    public Cat(){
        super();
        System.out.println("A cat class is created.");
    }

    public void eat(){
        System.out.println("Cat eats.");
    }

    public void sleep(){
        System.out.println("Cat sleeps.");
    }
}
