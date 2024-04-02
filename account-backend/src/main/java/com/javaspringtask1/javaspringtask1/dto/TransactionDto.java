package com.javaspringtask1.javaspringtask1.dto;

import com.javaspringtask1.javaspringtask1.model.TransactionStat;


import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionDto {

    private String id;

    private BigDecimal amount;

    private LocalDateTime transactionTime;

    private String transactionStat;

    public TransactionDto(String id, BigDecimal amount, LocalDateTime transactionTime, TransactionStat transactionStat) {
        this.id = id;
        this.amount = amount;
        this.transactionTime = transactionTime;
        this.transactionStat = String.valueOf(transactionStat);
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

    public String getTransactionStat() {
        return transactionStat;
    }

    public void setTransactionStat(String transactionStat) {
        this.transactionStat = transactionStat;
    }
}
