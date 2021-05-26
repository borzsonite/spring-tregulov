package ru.spring.hibernate_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.spring.hibernate_one_to_many_bi.entity.Department;
import ru.spring.hibernate_one_to_many_bi.entity.Employee;

import java.util.Arrays;


public class Test1 {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration() // 0. Создаем фабрику сессий
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = sessionFactory.getCurrentSession(); // 1. Получаем сессию
            Department itDeparment = new Department("IT", 5000, 1000,
                    Arrays.asList(new Employee("Ivan", "Ivanov", 2000),
                            new Employee("Maria", "Ivanova", 1000)));
            session.beginTransaction(); // 2. Начинаем транзакцию
            session.save(itDeparment); // 3. Делаем запрос к базе
            session.getTransaction().commit(); // 4. Делаем комит (завершаем транзакцию)


        } finally {
            sessionFactory.close();
            session.close();
        }
    }
}
