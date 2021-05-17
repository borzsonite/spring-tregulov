package ru.spring.tregulovcourse;

public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("meow");
    }
}
