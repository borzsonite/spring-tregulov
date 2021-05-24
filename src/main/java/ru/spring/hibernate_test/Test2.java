package ru.spring.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.spring.hibernate_test.entity.Employee;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration() // 0. Создаем фабрику сессий
                .configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession(); // 1. Получаем сессию
            session.beginTransaction(); // 2. Начинаем транзакцию

          //  List<Employee> emps = session.createQuery("from Employee").getResultList();// 3. Делаем запрос к базе

            List<Employee> emps = session.createQuery("from Employee where name='Alex' and salary>650").getResultList();

            session.getTransaction().commit(); // 4. Делаем комит (завершаем транзакцию)

            System.out.println("------------------------------------------------------");
            for(Employee emp: emps) {
                System.out.println(emp);
            }


        } finally {
            sessionFactory.close();
        }
    }
}
