package com.javaspringtask1.javaspringtask1.service;

import com.javaspringtask1.javaspringtask1.dto.CustomerDto;
import com.javaspringtask1.javaspringtask1.dto.converter.CustomerDtoConverter;
import com.javaspringtask1.javaspringtask1.exception.CustomerNotFoundException;
import com.javaspringtask1.javaspringtask1.model.Customer;
import com.javaspringtask1.javaspringtask1.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CustomerServiceTest {
    private CustomerService customerService;
    private CustomerRepository customerRepository;
    private CustomerDtoConverter customerDtoConverter;

    @BeforeEach
    public void setup() {
        customerRepository = Mockito.mock(CustomerRepository.class);
        customerDtoConverter = Mockito.mock(CustomerDtoConverter.class);
        customerService = new CustomerService(customerRepository, customerDtoConverter);
    }

    @Test
    public void testFindCustomerId_WhenCustomerExist_ShouldReturnCustomer() {
        Customer customer = new Customer("id", "enes", "şişik", new HashSet<>());
        Mockito.when(customerRepository.findById("id")).thenReturn(Optional.of(customer));

        Customer result = customerService.findCustomerById("id");

        assertEquals(result, customer);
    }
    @Test
    public void testFindCustomerId_WhenCustomerDoesNotExist_ShouldThrowCustomerNotFoundException() {
        Mockito.when(customerRepository.findById("id")).thenReturn(Optional.empty());
        assertThrows(CustomerNotFoundException.class,() -> customerService.findCustomerById("id"));
    }
    @Test
    public void testGetCustomerById_whenCustomerIdExist_ShouldReturnCustomerDto() {
        Customer customer = new Customer("id", "enes", "sisik", new HashSet<>());

        CustomerDto customerDto = new CustomerDto("id", "enes", "sisik", new HashSet<>());
        Mockito.when(customerRepository.findById("id")).thenReturn(Optional.of(customer));
        Mockito.when(customerDtoConverter.convertToCustomerDto(customer)).thenReturn(customerDto);


        CustomerDto result = customerService.getCustomerById("id");

        assertEquals(result,customerDto);
    }
    @Test
    public void testGetCustomerById_whenCustomerDoesNotExist_ShouldThrowCustomerNotFoundException() {
        Mockito.when(customerRepository.findById("id")).thenReturn(Optional.empty());


        assertThrows(CustomerNotFoundException.class,() -> customerService.getCustomerById("id"));
        Mockito.verifyNoInteractions(customerDtoConverter);
    }


}