package ru.spring.tregulovcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean", Person.class);

        person.call();
        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();

    }
}
