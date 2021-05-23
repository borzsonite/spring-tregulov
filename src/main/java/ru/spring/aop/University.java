package ru.spring.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        students.add(new Student("Ivan Ivanov", 2, 8.5));
        students.add(new Student("Petr Petrov", 3, 9.3));
        students.add(new Student("Mike Sidorov", 4, 7.4));
    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudents");
        System.out.println(students.get(3));
        System.out.println("Нормальное завершение метода .getStudents()");
        System.out.println(students);
        return students;
    }
}
