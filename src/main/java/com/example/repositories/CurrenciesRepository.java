package com.example.repositories;

import com.example.entities.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrenciesRepository extends JpaRepository<Currency, Long>
{
}