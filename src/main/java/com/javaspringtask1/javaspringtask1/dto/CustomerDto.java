package com.javaspringtask1.javaspringtask1.dto;

import com.javaspringtask1.javaspringtask1.model.Account;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.util.Set;

public class CustomerDto {

    private String id;

    private String name;
    private String surname;

    private Set<CustomerAccountDto> accounts;

}
