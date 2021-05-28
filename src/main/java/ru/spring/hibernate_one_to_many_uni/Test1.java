package ru.spring.hibernate_one_to_many_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.spring.hibernate_one_to_many_uni.entity.Department;
import ru.spring.hibernate_one_to_many_uni.entity.Employee;

import java.util.List;


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

//            Department department = new Department("HR ", 1500, 1000);
//            Employee emp1 = new Employee("Nick", "Smirnov", 1000);
//            Employee emp2 = new Employee("Mike", "Tyson", 1500);
//            department.addEmployee(emp1);
//            department.addEmployee(emp2);
            session.beginTransaction(); // 2. Начинаем транзакцию
//            session.save(department);
            //**************************************
            Department department = session.get(Department.class, 7);
            //Employee emp = session.get(Employee.class, 9);
//            List<Employee> employees = department.getEmps();
//            System.out.println(employees);

//            Employee employee = session.get(Employee.class, 7);
           // session.delete(department);
            session.delete(department);
            session.getTransaction().commit(); // 4. Делаем комит (завершаем транзакцию)

        } finally {
            sessionFactory.close();
            session.close();
        }
    }
}
