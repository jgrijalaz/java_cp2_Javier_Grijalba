package com.example.services.impl;

import com.example.entities.Customer;
import com.example.services.CustomerService;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService
{
    @Override
    public List<Customer> findAll()
    {
        return null;
    }

    @Override
    public Optional<Customer> findById(Long id)
    {
        return Optional.empty();
    }

    @Override
    public List<Customer> findAllBySurname1(String surname)
    {
        return null;
    }

    @Override
    public List<Customer> findAllBySurname2(String surname)
    {
        return null;
    }

    @Override
    public Customer save(Customer customer)
    {
        return null;
    }

    @Override
    public void saveAll(List<Customer> customers)
    {

    }

    @Override
    public Customer update(Customer customer)
    {
        return null;
    }

    @Override
    public void deleteById(Long id)
    {

    }

    @Override
    public void deleteAllById(List<Long> ids)
    {

    }
}
