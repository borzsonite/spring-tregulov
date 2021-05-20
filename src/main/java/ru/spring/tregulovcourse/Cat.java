package ru.spring.tregulovcourse;

import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat bean created...");
    }

    @Override
    public void say() {
        System.out.println("meow");
    }
}
