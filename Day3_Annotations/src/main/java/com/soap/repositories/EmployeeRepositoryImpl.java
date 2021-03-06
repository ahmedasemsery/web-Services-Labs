package com.soap.repositories;

import javax.persistence.*;

import com.soap.entity.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("Lab0101");
    EntityManager manager = managerFactory.createEntityManager();

    public void addEmployee(Employee employee) {
        manager.getTransaction().begin();

        manager.persist(employee);

        manager.getTransaction().commit();
    }

    public void updateEmployee(Employee employee) {
        manager.getTransaction().begin();

        manager.merge(employee);

        manager.getTransaction().commit();
    }

    public void deleteEmployee(int id) {
        Employee employee = (Employee) manager.find(Employee.class, id);
        manager.getTransaction().begin();

        manager.remove(employee);

        manager.getTransaction().commit();
    }

    public Employee getEmployee(int id) {
        Employee employee = (Employee) manager.find(Employee.class, id);

        return employee;
    }
}
