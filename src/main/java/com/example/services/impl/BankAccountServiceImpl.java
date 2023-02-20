package com.example.services.impl;

import com.example.entities.BankAccount;
import com.example.services.BankAccountService;

import java.util.List;
import java.util.Optional;

public class BankAccountServiceImpl implements BankAccountService
{
    @Override
    public List<BankAccount> findAll()
    {
        return null;
    }

    @Override
    public Optional<BankAccount> findById(Long id)
    {
        return Optional.empty();
    }

    @Override
    public BankAccount save(BankAccount bankAccount)
    {
        return null;
    }

    @Override
    public void saveAll(List<BankAccount> bankAccounts)
    {

    }

    @Override
    public BankAccount update(BankAccount bankAccount)
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
