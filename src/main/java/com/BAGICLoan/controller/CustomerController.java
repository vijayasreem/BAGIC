package com.BAGICLoan.controller;

import com.BAGICLoan.model.Customer;
import com.BAGICLoan.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/username/{username}")
    public Customer findByUsername(@PathVariable String username) {
        return customerService.findByUsername(username);
    }

    @GetMapping("/email/{email}")
    public Customer findByEmail(@PathVariable String email) {
        return customerService.findByEmail(email);
    }

    @GetMapping("/phoneNumber/{phoneNumber}")
    public Customer findByPhoneNumber(@PathVariable String phoneNumber) {
        return customerService.findByPhoneNumber(phoneNumber);
    }

    @GetMapping("/usernameAndPassword/{username}/{password}")
    public Customer findByUsernameAndPassword(@PathVariable String username, @PathVariable String password) {
        return customerService.findByUsernameAndPassword(username, password);
    }

    @GetMapping("/usernameAndMfaEnabled/{username}")
    public Customer findByUsernameAndMfaEnabled(@PathVariable String username) {
        return customerService.findByUsernameAndMfaEnabled(username);
    }

    @GetMapping("/emailAndMfaEnabled/{email}")
    public Customer findByEmailAndMfaEnabled(@PathVariable String email) {
        return customerService.findByEmailAndMfaEnabled(email);
    }

    @GetMapping("/phoneNumberAndMfaEnabled/{phoneNumber}")
    public Customer findByPhoneNumberAndMfaEnabled(@PathVariable String phoneNumber) {
        return customerService.findByPhoneNumberAndMfaEnabled(phoneNumber);
    }

    @GetMapping("/usernameAndMfaDeviceId/{username}/{mfaDeviceId}")
    public Customer findByUsernameAndMfaDeviceId(@PathVariable String username, @PathVariable String mfaDeviceId) {
        return customerService.findByUsernameAndMfaDeviceId(username, mfaDeviceId);
    }

    @GetMapping("/emailAndMfaDeviceId/{email}/{mfaDeviceId}")
    public Customer findByEmailAndMfaDeviceId(@PathVariable String email, @PathVariable String mfaDeviceId) {
        return customerService.findByEmailAndMfaDeviceId(email, mfaDeviceId);
    }

    @GetMapping("/phoneNumberAndMfaDeviceId/{phoneNumber}/{mfaDeviceId}")
    public Customer findByPhoneNumberAndMfaDeviceId(@PathVariable String phoneNumber, @PathVariable String mfaDeviceId) {
        return customerService.findByPhoneNumberAndMfaDeviceId(phoneNumber, mfaDeviceId);
    }

    @PostMapping("/enableMfa/{customerId}")
    public void enableMfa(@PathVariable Long customerId) {
        customerService.enableMfa(customerId);
    }

    @PostMapping("/disableMfa/{customerId}")
    public void disableMfa(@PathVariable Long customerId) {
        customerService.disableMfa(customerId);
    }

    @PostMapping("/setMfaDeviceId/{customerId}/{mfaDeviceId}")
    public void setMfaDeviceId(@PathVariable Long customerId, @PathVariable String mfaDeviceId) {
        customerService.setMfaDeviceId(customerId, mfaDeviceId);
    }

    @PostMapping("/incrementFailedMfaAttempts/{customerId}")
    public void incrementFailedMfaAttempts(@PathVariable Long customerId) {
        customerService.incrementFailedMfaAttempts(customerId);
    }

    @PostMapping("/resetFailedMfaAttempts/{customerId}")
    public void resetFailedMfaAttempts(@PathVariable Long customerId) {
        customerService.resetFailedMfaAttempts(customerId);
    }

    @PostMapping("/lockAccount/{customerId}")
    public void lockAccount(@PathVariable Long customerId) {
        customerService.lockAccount(customerId);
    }

    @PostMapping("/unlockAccount/{customerId}")
    public void unlockAccount(@PathVariable Long customerId) {
        customerService.unlockAccount(customerId);
    }

    @PostMapping("/lockAccountAndResetFailedMfaAttempts/{customerId}")
    public void lockAccountAndResetFailedMfaAttempts(@PathVariable Long customerId) {
        customerService.lockAccountAndResetFailedMfaAttempts(customerId);
    }
}