package com.example.springboot.services;

import com.example.springboot.entities.Customer;
import com.example.springboot.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{

  private final CustomerRepository repository;

  public CustomerService(CustomerRepository repository) {
    this.repository = repository;
  }

  public List<Customer> getAll(){
    return (List<Customer>) repository.findAll();
  }

  public Customer getById(Long id){
    return repository.findById(id).get();
  }

  public void deleteById(Long id){
    repository.deleteById(id);
  }

  public void save(Customer customer){
    repository.save(customer);
  }
}
