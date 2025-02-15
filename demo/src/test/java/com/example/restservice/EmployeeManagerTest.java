package com.example.restservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeManagerTest {

    @Test
    // Ensure that employees are added correctly
    void sampleTest() {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(new Employee(
        "ABCD",
        "Greg",
        "Basic",
        "gregbasic2025@gmail.com",
        "Engineer"
        ));
        assertEquals(
                employeeManager.getEmployees().get(3).getEmployee_id(),
                "ABCD"
        );
        assertEquals(
                employeeManager.getEmployees().get(3).getFirst_name(),
                "Greg"
        );
        assertEquals(
                employeeManager.getEmployees().get(3).getLast_name(),
                "Basic"
        );
        assertEquals(
                employeeManager.getEmployees().get(3).getEmail(),
                "gregbasic2025@gmail.com"
        );
        assertEquals(
                employeeManager.getEmployees().get(3).getTitle(),
                "Engineer"
        );
    }

    @Test
    // Ensure that employee list is populated on initialisation
    void createEmployeeManager() {
        EmployeeManager employeeManager = new EmployeeManager();
        assert(employeeManager.getEmployees().size() != 0);
    }
}