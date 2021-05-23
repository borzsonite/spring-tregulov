package ru.spring.aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import ru.spring.aop.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//        public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("***beforeGetStudentsLoggingAdvice логируем получение списка студентов перед методом getStudents()***");
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//        firstStudent.setNameSurname("Mr." + firstStudent.getNameSurname());
//        firstStudent.setAvgGrade(10.0);
//        System.out.println("***afterReturningStudentsLoggingAdvice логируем получение списка студентов после  работы метода getStudents()***");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("Логируем выброс исключения " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterStudentsLoggingAdvice() {
        System.out.println("afterStudentsLoggingAdvice");
    }

}
