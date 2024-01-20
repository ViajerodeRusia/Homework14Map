package com.EmployeeBook.Homework14Map.controller;

import com.EmployeeBook.Homework14Map.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(@Autowired EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping
    //TODO:http://localhost:8080/
    public String menu() {
        return employeeService.getAll();
    }
    @GetMapping(path = "/add")
    //TODO:http://localhost:8080/add?name=Richard&surname=Sapogov
    public String addEmployee(@RequestParam ("name") String name,@RequestParam ("surname") String surname) {
        return employeeService.addEmployee(name, surname);
    }
    @GetMapping(path = "/remove")
    public String removeEmployee(@RequestParam ("name") String name,@RequestParam ("surname") String surname) {
        return employeeService.removeEmployee(name, surname);
    }
    @GetMapping(path = "/search")
    public String searchEmployee(@RequestParam ("name") String name,@RequestParam ("surname") String surname) {
        return employeeService.searchEmployee(name, surname);
    }
}