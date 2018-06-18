package com.company;

/**
 * Created by Josemy_Macbook_Pro on 6/18/18.
 */
public class Bird extends Animal{

    public Bird(){
        super();
        System.out.println("A bird class is created.");
    }
    public void eat(){
        System.out.println("Bird eats.");
    }

    public void sleep(){
        System.out.println("Bird sleeps.");
    }

    public void fly(){
        System.out.println("A bird fly.");
    }

}
