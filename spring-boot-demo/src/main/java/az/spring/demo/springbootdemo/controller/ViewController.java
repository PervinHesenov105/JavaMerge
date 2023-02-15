package az.spring.demo.springbootdemo.controller;

import az.spring.demo.springbootdemo.model.Employee;
import az.spring.demo.springbootdemo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
@RequiredArgsConstructor
public class ViewController {

    private final EmployeeService employeeService;
    @GetMapping("/home")
    public String index(Model m){
        m.addAttribute("employees",employeeService.getEmployees());
        return "index";
    }
}
