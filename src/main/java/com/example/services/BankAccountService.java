package com.example.services;

import com.example.entities.BankAccount;

import java.util.List;
import java.util.Optional;

public interface BankAccountService
{
    List<BankAccount> findAll();
    Optional<BankAccount> findById(Long id);
    BankAccount save(BankAccount bankAccount);
    void saveAll(List<BankAccount> bankAccounts);
    BankAccount update(BankAccount bankAccount);
    void deleteById(Long id);
    void deleteAllById(List<Long> ids);
}
