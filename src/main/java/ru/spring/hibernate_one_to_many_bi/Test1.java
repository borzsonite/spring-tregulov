package ru.spring.hibernate_one_to_many_bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.spring.hibernate_one_to_one.entity.Detail;
import ru.spring.hibernate_one_to_one.entity.Employee;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration() // 0. Создаем фабрику сессий
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;

        try {
             session = sessionFactory.getCurrentSession(); // 1. Получаем сессию
            Employee emp = new Employee("Oleg", "Ivanov", "sales", 800);
            Detail empDetail = new Detail("oleg@mail.ru", "Rostow", "=744444444");
            emp.setEmpDetail(empDetail);
            session.beginTransaction(); // 2. Начинаем транзакцию
           // Employee emp = session.get(Employee.class, 1);
           // session.delete(employee);
            session.save(emp); // 3. Делаем запрос к базе
            //session.getTransaction().commit(); // 4. Делаем комит (завершаем транзакцию)

//            int myId = emp.getId();
            //session = sessionFactory.getCurrentSession(); // 1. Получаем сессию
            //session.beginTransaction(); // 2. Начинаем транзакцию
           // Employee employee = session.get(Employee.class, myId); // 3. Делаем запрос к базе
            session.getTransaction().commit(); // 4. Делаем комит (завершаем транзакцию)
            System.out.println(emp);


        } finally {
            sessionFactory.close();
            session.close();
        }
    }
}
