package com.EmployeeBook.Homework14Map.service;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    String getAll();
    String addEmployee(String name, String surname);
    String removeEmployee(String name, String surname);
    String searchEmployee(String name, String surname);
}