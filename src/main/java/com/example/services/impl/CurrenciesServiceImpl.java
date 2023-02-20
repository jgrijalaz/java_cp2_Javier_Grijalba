package com.example.services.impl;

import com.example.entities.Currency;
import com.example.services.CurrenciesService;

import java.util.List;
import java.util.Optional;

public class CurrenciesServiceImpl implements CurrenciesService
{
    @Override
    public List<Currency> findAll()
    {
        return null;
    }

    @Override
    public Optional<Currency> findById(Long id)
    {
        return Optional.empty();
    }

    @Override
    public Currency save(Currency currency)
    {
        return null;
    }

    @Override
    public void saveAll(List<Currency> currencys)
    {

    }

    @Override
    public Currency update(Currency currency)
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
