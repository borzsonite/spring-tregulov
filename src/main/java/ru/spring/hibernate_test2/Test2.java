package ru.spring.hibernate_test2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.spring.hibernate_test2.entity.Detail;
import ru.spring.hibernate_test2.entity.Employee;

public class Test2 {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration() // 0. Создаем фабрику сессий
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = sessionFactory.getCurrentSession(); // 1. Получаем сессию
            session.beginTransaction(); // 2. Начинаем транзакцию
//            Employee emp = new Employee("Kolya", "Nikolay", "HR", 650);
//            Detail empDetail = new Detail("saha@mail.ru", "Piter", "3331555");
//            empDetail.setEmployee(emp); // Важно!!! Чтобы id прописывался нужно засетить оба объекта!!!!!!
//            emp.setEmpDetail(empDetail);//Важно!!! Чтобы id прописывался нужно засетить оба объекта!!!!!!
//            session.save(empDetail);//3. Делаем запрос к базе
            Detail empDetail = session.get(Detail.class, 3);
            session.delete(empDetail);
            session.getTransaction().commit(); // 4. Делаем комит (завершаем транзакцию)



        } finally {
            sessionFactory.close();
            session.close();
        }
    }
}
