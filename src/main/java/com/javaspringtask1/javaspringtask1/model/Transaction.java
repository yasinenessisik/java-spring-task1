package com.javaspringtask1.javaspringtask1.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private BigDecimal amount;

    private LocalDateTime transactionTime;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    
    private Account account;

    @Enumerated(value = EnumType.STRING)
    private TransactionStat transactionStat;

    public Transaction(BigDecimal amount, Account account) {
        this.transactionTime = LocalDateTime.now();
        this.transactionStat = TransactionStat.INITIAL;
        this.amount = amount;
        this.account = account;
    }

    public Transaction() {

    }
}
