package com.javatechie.crud.example.service;

import com.javatechie.crud.example.entity.Employee;
import com.javatechie.crud.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public Employee saveProduct(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> saveProducts(List<Employee> employees) {
        return repository.saveAll(employees);
    }

    public List<Employee> getProducts() {
        return repository.findAll();
    }

    public Employee getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Employee getProductByName(String name) {
        return repository.findByName(name);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Employee removed !! " + id;
    }

    public Employee updateProduct(Employee employee) {
        Employee existingProduct = repository.findById(employee.getId()).orElse(null);
        existingProduct.setName(employee.getName());
        return repository.save(existingProduct);
    }


}
