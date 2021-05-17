package ru.spring.tregulovcourse;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bean was created");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

    public void init() {
        System.out.println("Init method");
    }

    public void destroy() {
        System.out.println("Destroy method");
    }
}
