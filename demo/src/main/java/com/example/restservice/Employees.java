package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList;

    public Employees() {
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public boolean removeEmployee(String employee_id) {
        return employeeList.removeIf(
                employee -> employee.getEmployee_id().equals(employee_id)
        );
    }

    public List<Employee> getEmployees() {
        return this.employeeList;
    }
}