package ru.spring.tregulovcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class); // указывать лучше интерфейс,
        // чтобы потом не менять код когда потребуется кошка вместо  собаки
        Person person = new Person(pet);
        person.call();



        context.close();

    }
}
