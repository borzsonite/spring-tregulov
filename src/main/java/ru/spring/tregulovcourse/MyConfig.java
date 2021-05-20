package ru.spring.tregulovcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
//@ComponentScan("ru.spring.tregulovcourse")
public class MyConfig {

    @Bean("catBean")
    public Pet cat() {
        return new Cat();
    }

    @Bean("personBean")
    public Person person() {
        return new Person(cat());
    }
}
