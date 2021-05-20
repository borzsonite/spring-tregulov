package ru.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(-2)
public class ExceptionHandlingAspect {
    @Before("ru.spring.aop.aspects.MyPointcuts.allAddMethod()")
    public void beforeAddExceptionHandlingAspect() {
        System.out.println("beforeGetExceptionHandlingAspect: обработка исключения");
        System.out.println("---------------------------------");

    }
}
