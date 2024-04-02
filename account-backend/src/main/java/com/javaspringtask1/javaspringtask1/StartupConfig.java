package com.javaspringtask1.javaspringtask1;

import com.javaspringtask1.javaspringtask1.model.Customer;
import com.javaspringtask1.javaspringtask1.repository.CustomerRepository;
import com.javaspringtask1.javaspringtask1.service.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class StartupConfig implements CommandLineRunner {
    private final CustomerRepository customerRepository;

    public StartupConfig(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Customer customer = customerRepository.save(new Customer("","yasin enes", "şişik",new HashSet<>()));
        System.out.println(customer);
    }
}