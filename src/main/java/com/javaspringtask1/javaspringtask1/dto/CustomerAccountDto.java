package com.javaspringtask1.javaspringtask1.dto;

import com.javaspringtask1.javaspringtask1.model.Transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

public class CustomerAccountDto {
    private String id;

    private BigDecimal balance;

    private LocalDate creationDate;

    private Set<Transaction> transactions;
}
