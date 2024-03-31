package com.javaspringtask1.javaspringtask1.dto;

import com.javaspringtask1.javaspringtask1.model.Account;
import lombok.Builder;

import java.math.BigDecimal;
import java.util.Set;
@Builder
public class AccountCustomerDto {
    private String id;

    private String name;
    private String surname;

}
