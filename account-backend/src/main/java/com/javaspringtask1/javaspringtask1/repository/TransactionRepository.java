package com.javaspringtask1.javaspringtask1.repository;

import com.javaspringtask1.javaspringtask1.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,String> {
}
