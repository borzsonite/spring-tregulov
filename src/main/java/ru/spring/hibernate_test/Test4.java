package ru.spring.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.spring.hibernate_test.entity.Employee;

public class Test4 {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration() // 0. Создаем фабрику сессий
                .configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession(); // 1. Получаем сессию
            session.beginTransaction(); // 2. Начинаем транзакцию

//            Employee emp = session.get(Employee.class, 1);// 3. Делаем запрос к базе
//            session.delete(emp);
            session.createQuery("delete Employee where name = 'Alex'").executeUpdate();


            session.getTransaction().commit(); // 4. Делаем комит (завершаем транзакцию)


        } finally {
            sessionFactory.close();
        }
    }
}
