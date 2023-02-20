package com.example.services;

import com.example.entities.Currency;

import java.util.List;
import java.util.Optional;

public interface CurrenciesService
{
    List<Currency> findAll();
    Optional<Currency> findById(Long id);
    Currency save(Currency currency);
    void saveAll(List<Currency> currencys);
    Currency update(Currency currency);
    void deleteById(Long id);
    void deleteAllById(List<Long> ids);
}
