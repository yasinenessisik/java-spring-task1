package com.javaspringtask1.javaspringtask1.dto;

import com.javaspringtask1.javaspringtask1.model.Account;
import com.javaspringtask1.javaspringtask1.model.TransactionStat;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionDto {

    private String id;

    private BigDecimal amount;

    private LocalDateTime transactionTime;

    private Account account;

    private String transactionStat;
}
