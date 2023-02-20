package com.example.services.impl;

import com.example.entities.Bank;
import com.example.services.BankService;

import java.util.List;
import java.util.Optional;

public class BankServiceImpl implements BankService
{
    @Override
    public List<Bank> findAll()
    {
        return null;
    }

    @Override
    public Optional<Bank> findById(Long id)
    {
        return Optional.empty();
    }

    @Override
    public Bank save(Bank bank)
    {
        return null;
    }

    @Override
    public void saveAll(List<Bank> banks)
    {

    }

    @Override
    public Bank update(Bank bank)
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
