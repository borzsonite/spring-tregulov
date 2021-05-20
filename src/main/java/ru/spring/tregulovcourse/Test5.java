package ru.spring.tregulovcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Cat cat = context.getBean("catBean", Cat.class);
        cat.say();
        Person person = context.getBean("personBean", Person.class);
        person.call();
        System.out.println(person.getAge());
        System.out.println(person.getName());

    }
}
