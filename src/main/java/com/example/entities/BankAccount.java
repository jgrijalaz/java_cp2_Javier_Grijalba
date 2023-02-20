package com.example.entities;

import com.example.entities.enums.AccountType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder

@Entity
@Table(name = "Bank_accounts")
public class BankAccount
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String iban;
    private double balance;

    @ManyToOne
    private Bank bank;

    @ManyToOne
    private Customer customer;

    private AccountType accountType;
    private double cost;
    private double interest;

    @ManyToMany
    @ToString.Exclude
    private HashSet<Currency> supportedCurrencies;

    private LocalDate expires;


}