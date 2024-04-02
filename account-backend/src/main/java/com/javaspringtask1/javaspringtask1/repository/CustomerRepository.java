package com.javaspringtask1.javaspringtask1.repository;

import com.javaspringtask1.javaspringtask1.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String> {
}
