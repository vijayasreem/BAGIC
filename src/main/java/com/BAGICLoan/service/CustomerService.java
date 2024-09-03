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

    public Customer findByUsername(String username) {
        return customerRepository.findByUsername(username);
    }

    public Customer findByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    public Customer findByPhoneNumber(String phoneNumber) {
        return customerRepository.findByPhoneNumber(phoneNumber);
    }

    public Customer findByUsernameAndPassword(String username, String password) {
        return customerRepository.findByUsernameAndPassword(username, password);
    }

    public Customer findByUsernameAndMfaEnabled(String username) {
        return customerRepository.findByUsernameAndMfaEnabled(username);
    }

    public Customer findByEmailAndMfaEnabled(String email) {
        return customerRepository.findByEmailAndMfaEnabled(email);
    }

    public Customer findByPhoneNumberAndMfaEnabled(String phoneNumber) {
        return customerRepository.findByPhoneNumberAndMfaEnabled(phoneNumber);
    }

    public Customer findByUsernameAndMfaDeviceId(String username, String mfaDeviceId) {
        return customerRepository.findByUsernameAndMfaDeviceId(username, mfaDeviceId);
    }

    public Customer findByEmailAndMfaDeviceId(String email, String mfaDeviceId) {
        return customerRepository.findByEmailAndMfaDeviceId(email, mfaDeviceId);
    }

    public Customer findByPhoneNumberAndMfaDeviceId(String phoneNumber, String mfaDeviceId) {
        return customerRepository.findByPhoneNumberAndMfaDeviceId(phoneNumber, mfaDeviceId);
    }

    public void enableMfa(Long customerId) {
        customerRepository.enableMfa(customerId);
    }

    public void disableMfa(Long customerId) {
        customerRepository.disableMfa(customerId);
    }

    public void setMfaDeviceId(Long customerId, String mfaDeviceId) {
        customerRepository.setMfaDeviceId(customerId, mfaDeviceId);
    }

    public void incrementFailedMfaAttempts(Long customerId) {
        customerRepository.incrementFailedMfaAttempts(customerId);
    }

    public void resetFailedMfaAttempts(Long customerId) {
        customerRepository.resetFailedMfaAttempts(customerId);
    }

    public void lockAccount(Long customerId) {
        customerRepository.lockAccount(customerId);
    }

    public void unlockAccount(Long customerId) {
        customerRepository.unlockAccount(customerId);
    }

    public void lockAccountAndResetFailedMfaAttempts(Long customerId) {
        customerRepository.lockAccountAndResetFailedMfaAttempts(customerId);
    }
}