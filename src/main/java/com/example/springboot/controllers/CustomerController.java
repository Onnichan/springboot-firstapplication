package com.example.springboot.controllers;

import com.example.springboot.entities.Customer;
import com.example.springboot.services.ICustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

private final ICustomerService service;

  public CustomerController(ICustomerService service) {
    this.service = service;
  }

  @GetMapping("/api/customers")
  public List<Customer> getAll(){
    return service.getAll();
  }

  @GetMapping("/api/customers/{id}")
  public Customer getById(@PathVariable Long id){
    System.out.println(id);
    return service.getById(id);
  }

  @DeleteMapping("/api/customers/{id}")
  public void deleteById(@PathVariable Long id){
    service.deleteById(id);
  }

  @PostMapping("/api/customers")
  public void save(@RequestBody Customer customer){
    service.save(customer);
  }
}
