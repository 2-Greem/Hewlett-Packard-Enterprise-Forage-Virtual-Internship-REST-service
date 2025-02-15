package com.example.restservice;

import java.util.List;

public class EmployeeManager {

    private Employees employeeList;

    public EmployeeManager() {
        this.employeeList = new Employees();
        this.employeeList.addEmployee(
            new Employee("B1000",
                    "Jeremy",
                    "Dwight",
                    "jdwight@gmail.com",
                    "Doctor")
        );
        this.employeeList.addEmployee(
                new Employee("A1000",
                        "John",
                        "Enemy",
                        "jenemy@gmail.com",
                        "Mr")
        );
        this.employeeList.addEmployee(
                new Employee("C1000",
                        "Nyx",
                        "Fortuna",
                        "j19vni@gmail.com",
                        "Ms")
        );
    }

    public List<Employee> getEmployees() {
        return employeeList.getEmployees();
    }

    public void addEmployee(Employee employee) {
        this.employeeList.addEmployee(employee);
    }

    public boolean deleteEmployee(String employee_id) { return this.employeeList.removeEmployee(employee_id);}
}