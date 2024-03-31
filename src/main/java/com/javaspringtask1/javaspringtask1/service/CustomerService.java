package com.javaspringtask1.javaspringtask1.service;

import com.javaspringtask1.javaspringtask1.exception.CustomerNotFoundException;
import com.javaspringtask1.javaspringtask1.model.Customer;
import com.javaspringtask1.javaspringtask1.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    protected Customer findCustomerById(String id){
        return customerRepository.findById(id)
                .orElseThrow(() -> new CustomerNotFoundException("Customer Not Found by Id "+ id));
    }


}
