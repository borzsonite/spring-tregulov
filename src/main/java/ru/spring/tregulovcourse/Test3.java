package ru.spring.tregulovcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
       // Dog dog1 = context.getBean("myPet", Dog.class);
//        Dog dog2 = context.getBean("myPet", Dog.class);
//        System.out.println(dog1 == dog2);
        ///dog1.say();
        context.close();


    }
}

