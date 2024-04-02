package com.javaspringtask1.javaspringtask1.service;

import com.javaspringtask1.javaspringtask1.model.Account;
import com.javaspringtask1.javaspringtask1.model.Transaction;
import com.javaspringtask1.javaspringtask1.repository.TransactionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;

    private static Logger logger = LoggerFactory.getLogger(TransactionService.class);

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }
    protected Transaction initateMoney(final Account account, BigDecimal amount){
        return transactionRepository.save(
                new Transaction(amount,
                        account)
        );
    }
}
