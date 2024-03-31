package com.javaspringtask1.javaspringtask1.service;

import com.javaspringtask1.javaspringtask1.dto.CustomerDto;
import com.javaspringtask1.javaspringtask1.dto.converter.CustomerDtoConverter;
import com.javaspringtask1.javaspringtask1.exception.CustomerNotFoundException;
import com.javaspringtask1.javaspringtask1.model.Customer;
import com.javaspringtask1.javaspringtask1.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerDtoConverter converter;

    public CustomerService(CustomerRepository customerRepository, CustomerDtoConverter converter) {
        this.customerRepository = customerRepository;
        this.converter = converter;
    }

    protected Customer findCustomerById(String id){
        return customerRepository.findById(id)
                .orElseThrow(() -> new CustomerNotFoundException("Customer Not Found by Id "+ id));
    }

    public CustomerDto getCustomerById(String customerId) {
        Customer customer = findCustomerById(customerId);
        return converter.convertToCustomerDto(customer);
    }

    public List<CustomerDto> getAllCustomer() {
        return customerRepository.findAll().stream()
                .map(t-> converter.convertToCustomerDto(t)).collect(Collectors.toList());
    }

}
