package com.example.services;

import com.example.entities.Bank;

import java.util.List;
import java.util.Optional;

public interface BankService
{
    List<Bank> findAll();
    Optional<Bank> findById(Long id);
    Bank save(Bank bank);
    void saveAll(List<Bank> banks);
    Bank update(Bank bank);
    void deleteById(Long id);
    void deleteAllById(List<Long> ids);
}
