package org.example;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
    public void init() {
        System.out.println("Class Dog: init method");
    }
    public void destroye() {
        System.out.println("Class Dog: destroye method");
    }
}
