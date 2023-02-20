package com.example.services;

import com.example.entities.BankAccount;
import com.example.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService
{
    List<Customer> findAll();
    Optional<Customer> findById(Long id);
    List<Customer> findAllBySurname1(String surname);
    List<Customer> findAllBySurname2(String surname);
    Customer save(Customer customer);
    void saveAll(List<Customer> customers);
    Customer update(Customer customer);
    void deleteById(Long id);
    void deleteAllById(List<Long> ids);
}

//    List<Food> findAll();
//    Optional<Food> findById(Long id);
//    List<Food> findAllByCategory(String category);
//    List<Food> findAllByColor(String color);
//    List<Food> findAllByCategoryAndColor(String category, String color);
//    List<Food> findAllBySupermarketId(Long id);
//    Food save(Food food);
//    void deleteById(Long id);
//    void deleteAllById(List<Long> ids);
//    void saveAll(List<Food> foods);