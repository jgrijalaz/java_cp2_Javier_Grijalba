package com.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "currencies")
public class Currencies
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private double dollarConversion;
}