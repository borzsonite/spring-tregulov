package ru.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        Book book = context.getBean("book", Book.class);

        //uniLibrary.getBook();
        //uniLibrary.getMagazine();
        //schoolLibrary.getBook();
        // schoolLibrary.returnBook();
       // uniLibrary.returnBook();
       // uniLibrary.returnMagazine();
       // uniLibrary.addBook("Serge", book);
        //uniLibrary.addMagazine();

        context.close();
    }
}
