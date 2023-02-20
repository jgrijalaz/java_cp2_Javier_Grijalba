package com.example.entities;

import jakarta.persistence.*;

import java.util.HashSet;

@Entity
@Table(name = "customer")
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nif;
    private String name;
    private String surname1;
    private String getSurname2;

    @OneToMany(mappedBy = "customer")
    private HashSet<BankAccount> bankAccounts;
}