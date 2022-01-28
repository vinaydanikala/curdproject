package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.entity.Employee;
import com.javatechie.crud.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/addEmployee")
    public Employee addProduct(@RequestBody Employee employee) {
        return service.saveProduct(employee);
    }

    @PostMapping("/addEmployees")
    public List<Employee> addProducts(@RequestBody List<Employee> employees) {
        return service.saveProducts(employees);
    }

    @GetMapping("/Employes")
    public List<Employee> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/EmployeeById/{id}")
    public Employee findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/Employee/{name}")
    public Employee findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public Employee updateProduct(@RequestBody Employee employee) {
        return service.updateProduct(employee);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}
