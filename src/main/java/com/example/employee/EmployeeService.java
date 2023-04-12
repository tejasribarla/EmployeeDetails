
package com.example.employee;

import com.example.employee.Employee;
import com.example.employee.EmployeeRepository;

import java.util.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
 

public class EmployeeService implements EmployeeRepository {

    private static HashMap<Integer, Employee> employeeList = new HashMap<>();
    int uniqueEmployeeId=5;

    public EmployeeService() {
        employeeList.put(1, new Employee(1, "John", "Doe", "johndoe@example.com", 9847987534L,"May-10", 250000));
        employeeList.put(2, new Employee(2, "Jane" ,"Smith", "janesmith@example.com",978498354L, "Oct-15", 450000));
        employeeList.put(3, new Employee(3, "Bob", "Johnson", "bjohnson@example.com", 973849823L, "May-10", 700000));
        employeeList.put(4, new Employee(4, "Alice","Lee", "alee@example.com", 9378859739L, "Oct-10" ,1000000));
        
    }
   
    @Override
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeId(uniqueEmployeeId);
        employeeList.put(uniqueEmployeeId,employee);
        uniqueEmployeeId+=1;
        return employee;
    }
    
}