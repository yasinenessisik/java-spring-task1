package com.javaspringtask1.javaspringtask1.dto;

import com.javaspringtask1.javaspringtask1.model.Transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

public class CustomerAccountDto {
    private String id;

    private BigDecimal balance;

    private LocalDateTime creationDate;

    private Set<Transaction> transactions;
}
