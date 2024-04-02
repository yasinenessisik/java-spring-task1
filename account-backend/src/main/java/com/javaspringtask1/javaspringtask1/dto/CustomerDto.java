package com.javaspringtask1.javaspringtask1.dto;


import java.util.Set;

public class CustomerDto {

    private String id;

    private String name;
    private String surname;

    private Set<CustomerAccountDto> accounts;

    public CustomerDto(String id, String name, String surname, Set<CustomerAccountDto> accounts) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.accounts = accounts;
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

    public Set<CustomerAccountDto> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<CustomerAccountDto> accounts) {
        this.accounts = accounts;
    }
}
