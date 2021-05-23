package ru.spring.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.spring.aop.Book;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//   @Pointcut("execution(* ru.spring.aop.UniLibrary.*(..))")
//   private void allMethodsFromUniLibrary() {}
//
//   @Pointcut("execution(public void ru.spring.aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary())")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineFromUniLibraryAdvice() {
//        System.out.println("Writing log#4");
//    }

//    @Pointcut("execution(* ru.spring.aop.UniLibrary.get*())")
//    private void allGetMethodFromUniLibrary() {}

//    @Pointcut("execution(* ru.spring.aop.UniLibrary.return*())")
//    private void allReturnMethodFromUniLibrary() {}
//
//    @Pointcut("allGetMethodFromUniLibrary() || allReturnMethodFromUniLibrary()")
//    private void allGetAndReturnMethodFromUniLibrary() {}
//
//    @Before("allGetMethodFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing log#1");
//    }
//
//    @Before("allReturnMethodFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing log#2");
//    }
//
//    @Before("allGetAndReturnMethodFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice () {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing log#3");
//    }




    @Before("ru.spring.aop.aspects.MyPointcuts.allAddMethod()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.returnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")) {
            Object[] objects = joinPoint.getArgs();
            for(Object obj: objects) {
                if(obj instanceof Book) {
                    Book book = (Book) obj;
                    System.out.println("Информация о книге: наименование - " + book.getName() + " Автор - " + book.getAuthor() + " Год издания - " + book.getYearOfPublication());
                } else if (obj instanceof String ){
                    System.out.println("Книгу добавил - " + obj);
                }
            }
        }

        System.out.println("beforeGetLoggingAdvice: логирование попытки добавить книгу/журнал");
        System.out.println("---------------------------------");
    }


}
