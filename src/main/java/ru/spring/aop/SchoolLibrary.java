package ru.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{
   public void getBook() {
        System.out.println("Мы берем книгу из SchoolLibrary");
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу в SchoolLibrary");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из SchoolLibrary ");
    }
}
