package ru.spring.tregulovcourse;

public class Person {
    private Pet pet;
    private String name;
    private int age;

    public Person() {

    }

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void call() {
        System.out.println("Come here...");
        pet.say();
    }
}
