package com.javaspringtask1.javaspringtask1.model;

import jakarta.persistence.*;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
@Entity
@ToString
public class Customer {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String name;

    private String surname;

    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)
    private Set<Account> accounts;

    public Customer(String id, String name, String surname, Set<Account> accounts) {
        this.id = "";
        this.name = name;
        this.surname = surname;
        this.accounts = new HashSet<>();
    }

    public Customer() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }


}
