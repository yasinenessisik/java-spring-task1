package com.javaspringtask1.javaspringtask1.service;

import com.javaspringtask1.javaspringtask1.dto.AccountCustomerDto;
import com.javaspringtask1.javaspringtask1.dto.AccountDto;
import com.javaspringtask1.javaspringtask1.dto.CreateAccountRequest;
import com.javaspringtask1.javaspringtask1.model.Account;
import com.javaspringtask1.javaspringtask1.model.Customer;
import com.javaspringtask1.javaspringtask1.model.Transaction;
import com.javaspringtask1.javaspringtask1.repository.AccountRepository;
import com.javaspringtask1.javaspringtask1.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class AccountService {
    private final AccountRepository accountRepository;
    private final CustomerService customerService;
    private final TransactionService transactionService;


    public AccountService(AccountRepository accountRepository,
                          CustomerService customerService,
                          TransactionService transactionService) {
        this.accountRepository = accountRepository;
        this.customerService = customerService;
        this.transactionService = transactionService;
    }

    public AccountDto createAccount(CreateAccountRequest createAccountRequest){
        Customer customer = customerService.findCustomerById(createAccountRequest.getId());
        Account account = new Account(
                createAccountRequest.getInitialCredit(),
                LocalDateTime.now(),
                customer
        );
        if(createAccountRequest.getInitialCredit().compareTo(BigDecimal.ZERO)>0){
            Transaction transaction = transactionService.initateMoney(account,createAccountRequest.getInitialCredit());
            account.getTransactions().add(transaction);
        }
        Account newAccount = accountRepository.save(account);
        return AccountDto.builder()
                .id(newAccount.getId())
                .balance(newAccount.getBalance())
                .creationDate(newAccount.getCreationDate())
                .customer(AccountCustomerDto.builder()
                        .id(customer.getId())
                        .name(customer.getName())
                        .surname(customer.getSurname())
                        .build())
                .transactions(account.getTransactions())
                .build();
    }
}
