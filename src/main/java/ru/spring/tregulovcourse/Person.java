package ru.spring.tregulovcourse;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void call() {
        System.out.println("Come here...");
        pet.say();
    }
}
