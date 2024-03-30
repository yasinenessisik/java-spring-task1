package com.javaspringtask1.javaspringtask1.dto;

import com.javaspringtask1.javaspringtask1.model.Customer;
import com.javaspringtask1.javaspringtask1.model.Transaction;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

public class AccountDto {
    private String id;

    private BigDecimal balance;

    private LocalDate creationDate;

    private Customer customer;

    private Set<Transaction> transactions;

}
