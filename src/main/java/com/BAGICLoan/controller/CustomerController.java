package com.BAGICLoan.controller;

import com.BAGICLoan.model.Customer;
import com.BAGICLoan.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/verify/{identityVerification}/{addressVerification}")
    public String verifyCustomer(@PathVariable String identityVerification, @PathVariable String addressVerification) {
        Customer customer = customerService.findByVerificationStatus(identityVerification, addressVerification);

        if (customer != null) {
            if (customer.getIdentityVerification().equalsIgnoreCase("yes") && customer.getAddressVerification().equalsIgnoreCase("yes")) {
                return "Customer is eligible for banking services.";
            } else {
                return "Document verification is incomplete. Customer is not eligible for banking services.";
            }
        } else {
            return "Customer not found.";
        }
    }

    // Other business methods and endpoints can be added here
}