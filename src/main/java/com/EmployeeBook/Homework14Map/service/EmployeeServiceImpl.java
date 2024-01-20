package com.EmployeeBook.Homework14Map.service;
import com.EmployeeBook.Homework14Map.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final Map<String, Employee> employees;

    public EmployeeServiceImpl() {
        employees = new HashMap<>();
    }

    public String makeKey(String name, String surname) {
        return (name+surname).toLowerCase();
    }

    public String addEmployee(String name, String surname) {
        employees.put(makeKey(name, surname),new Employee(name, surname));
        return "Сотрудник добавлен";
    }
    public String removeEmployee(String name, String surname) {
       if(employees.containsKey(makeKey(name, surname))) {
           employees.remove(makeKey(name, surname));
       } else return "Сотрудник не найден";
       return "Сотрудник удален";
    }
    public String searchEmployee(String name, String surname) {
        if(employees.containsKey(makeKey(name, surname))) {
            return employees.get(makeKey(name, surname)).toString();
        } else return "Сотрудник не найден";
    }

    public String getAll() {
        return employees.values().toString();
    }
}