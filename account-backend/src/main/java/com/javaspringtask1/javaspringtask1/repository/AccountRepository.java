package com.javaspringtask1.javaspringtask1.repository;

import com.javaspringtask1.javaspringtask1.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,String> {
}
