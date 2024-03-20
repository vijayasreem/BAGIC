package com.BAGICLoan.service;

import com.BAGICLoan.model.Customer;
import com.BAGICLoan.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer findByVerificationStatus(String identityVerification, String addressVerification) {
        return customerRepository.findByVerificationStatus(identityVerification, addressVerification);
    }
}