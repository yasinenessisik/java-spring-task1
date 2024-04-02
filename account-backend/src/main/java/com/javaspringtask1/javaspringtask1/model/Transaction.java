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

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public TransactionStat getTransactionStat() {
        return transactionStat;
    }

    public void setTransactionStat(TransactionStat transactionStat) {
        this.transactionStat = transactionStat;
    }
}
