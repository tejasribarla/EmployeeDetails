
package com.example.employee;

import org.springframework.web.bind.annotation.*;

@RestController

public class EmployeeController{
    EmployeeService employeeService= new EmployeeService();   

 @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
    
}

  
