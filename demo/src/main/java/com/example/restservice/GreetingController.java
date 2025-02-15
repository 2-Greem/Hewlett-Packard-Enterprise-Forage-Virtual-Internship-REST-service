package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final EmployeeManager employeeManager = new EmployeeManager();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/employees")
    public List<Employee> employeeManager() {
        return this.employeeManager.getEmployees();
    }

    @PostMapping("/employees/add")
    public String addEmployee(@RequestBody Employee employee){
        this.employeeManager.addEmployee(employee);
        return "Added Employee: " + employee.getFirst_name() + " " + employee.getLast_name();
    }

    @PostMapping("/employees/delete")
    public String deleteEmployee(@RequestBody String employee_id){
        if (this.employeeManager.deleteEmployee(employee_id) == true) {
            return "Removed Employee: " + employee_id;
        } else {
            return "Error Removing Employee: " + employee_id;
        }
    }

    @PostMapping("employees/update")
    public String updateEmployee(@RequestBody Employee employee){
        if (this.employeeManager.deleteEmployee(employee.getEmployee_id()) == false) {
            return "Error: Could not find existing employee for id: " + employee.getEmployee_id();
        } else {
            this.employeeManager.addEmployee(employee);
            return "Updated employee data for employee: " + employee.getEmployee_id();
        }
    }
}