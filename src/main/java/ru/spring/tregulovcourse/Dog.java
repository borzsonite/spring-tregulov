package ru.spring.tregulovcourse;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bean created");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
