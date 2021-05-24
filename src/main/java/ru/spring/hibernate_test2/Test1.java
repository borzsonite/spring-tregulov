package ru.spring.hibernate_test2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.spring.hibernate_test.entity.Employee;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration() // 0. Создаем фабрику сессий
                .configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{
            Employee emp = new Employee("Maria", "Petrova", "PR", 500);
            Session session = sessionFactory.getCurrentSession(); // 1. Получаем сессию
            session.beginTransaction(); // 2. Начинаем транзакцию
            session.save(emp); // 3. Делаем запрос к базе
            //session.getTransaction().commit(); // 4. Делаем комит (завершаем транзакцию)

            int myId = emp.getId();
            //session = sessionFactory.getCurrentSession(); // 1. Получаем сессию
            //session.beginTransaction(); // 2. Начинаем транзакцию
            Employee employee =  session.get(Employee.class, myId); // 3. Делаем запрос к базе
            session.getTransaction().commit(); // 4. Делаем комит (завершаем транзакцию)
            System.out.println(employee);


        } finally {
            sessionFactory.close();
        }
    }
}
