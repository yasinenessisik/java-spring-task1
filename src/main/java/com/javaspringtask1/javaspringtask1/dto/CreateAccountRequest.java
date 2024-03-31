package com.javaspringtask1.javaspringtask1.dto;

import com.javaspringtask1.javaspringtask1.model.Transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

public class CreateAccountRequest {
    private String id;

    public CreateAccountRequest(String id, BigDecimal initialCredit) {
        this.id = id;
        this.initialCredit = initialCredit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getInitialCredit() {
        return initialCredit;
    }

    public void setInitialCredit(BigDecimal initialCredit) {
        this.initialCredit = initialCredit;
    }

    private BigDecimal initialCredit;

}
