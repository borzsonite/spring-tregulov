package ru.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);
        university.addStudents();
        try{
            System.out.println(university.getStudents());
        } catch (Exception e) {
            System.out.println("Поймано исключение "+ e);
        }



        context.close();
    }
}
