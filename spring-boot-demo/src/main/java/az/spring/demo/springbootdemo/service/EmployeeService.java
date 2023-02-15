package az.spring.demo.springbootdemo.service;

import az.spring.demo.springbootdemo.model.Employee;
import az.spring.demo.springbootdemo.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;


    public List<Employee> getEmployees(){

        return employeeRepository.findAll();

    }
}