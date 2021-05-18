package ru.spring.tregulovcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
   // @Autowired
   // @Qualifier("catBean")
    private Pet pet;
    private String name;
    private int age;

    public Person() {
        System.out.println("Person bean created...");
    }

    @Autowired
    public Person(@Qualifier("dog") Pet pet) {
        System.out.println("Person bean created...");
        this.pet = pet;
    }

//    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person set pet");
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
