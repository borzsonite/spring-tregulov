package ru.spring.tregulovcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person =  context.getBean("myPerson", Person.class);
        person.call();
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
