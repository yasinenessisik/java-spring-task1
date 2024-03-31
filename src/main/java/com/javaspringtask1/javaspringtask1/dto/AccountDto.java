package com.javaspringtask1.javaspringtask1.dto;

import com.javaspringtask1.javaspringtask1.model.Customer;
import com.javaspringtask1.javaspringtask1.model.Transaction;
import jakarta.persistence.*;
import lombok.Builder;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
@Builder
public class AccountDto {
    private String id;

    private BigDecimal balance;

    private LocalDateTime creationDate;

    private AccountCustomerDto customer;

    private Set<Transaction> transactions;

}
