package com.BAGICLoan.service;

import com.BAGICLoan.model.CreditCheck;
import com.BAGICLoan.repository.CreditCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditCheckService {

    private final CreditCheckRepository creditCheckRepository;

    @Autowired
    public CreditCheckService(CreditCheckRepository creditCheckRepository) {
        this.creditCheckRepository = creditCheckRepository;
    }

    // Method to retrieve credit check by customer ID
    public CreditCheck findByCustomerId(Long customerId) {
        return creditCheckRepository.findByCustomerId(customerId);
    }

    // Method to retrieve credit check by channel
    public CreditCheck findByChannel(String channel) {
        return creditCheckRepository.findByChannel(channel);
    }

    // Method to retrieve credit check by status
    public CreditCheck findByStatus(String status) {
        return creditCheckRepository.findByStatus(status);
    }

    // Method to retrieve credit check by completion time
    public CreditCheck findByCompletionTime(String completionTime) {
        return creditCheckRepository.findByCompletionTime(completionTime);
    }

    // Custom query to retrieve credit check by customer ID and channel
    public CreditCheck findByCustomerIdAndChannel(Long customerId, String channel) {
        return creditCheckRepository.findByCustomerIdAndChannel(customerId, channel);
    }

    // Custom query to retrieve credit check by customer ID and status
    public CreditCheck findByCustomerIdAndStatus(Long customerId, String status) {
        return creditCheckRepository.findByCustomerIdAndStatus(customerId, status);
    }

    // Custom query to retrieve credit check by customer ID and completion time
    public CreditCheck findByCustomerIdAndCompletionTime(Long customerId, String completionTime) {
        return creditCheckRepository.findByCustomerIdAndCompletionTime(customerId, completionTime);
    }

    // Custom query to retrieve credit check by channel and status
    public CreditCheck findByChannelAndStatus(String channel, String status) {
        return creditCheckRepository.findByChannelAndStatus(channel, status);
    }

    // Custom query to retrieve credit check by channel and completion time
    public CreditCheck findByChannelAndCompletionTime(String channel, String completionTime) {
        return creditCheckRepository.findByChannelAndCompletionTime(channel, completionTime);
    }

    // Custom query to retrieve credit check by status and completion time
    public CreditCheck findByStatusAndCompletionTime(String status, String completionTime) {
        return creditCheckRepository.findByStatusAndCompletionTime(status, completionTime);
    }

    // Custom query to retrieve credit check by customer ID, channel, and status
    public CreditCheck findByCustomerIdAndChannelAndStatus(Long customerId, String channel, String status) {
        return creditCheckRepository.findByCustomerIdAndChannelAndStatus(customerId, channel, status);
    }

    // Custom query to retrieve credit check by customer ID, channel, and completion time
    public CreditCheck findByCustomerIdAndChannelAndCompletionTime(Long customerId, String channel, String completionTime) {
        return creditCheckRepository.findByCustomerIdAndChannelAndCompletionTime(customerId, channel, completionTime);
    }

    // Custom query to retrieve credit check by customer ID, status, and completion time
    public CreditCheck findByCustomerIdAndStatusAndCompletionTime(Long customerId, String status, String completionTime) {
        return creditCheckRepository.findByCustomerIdAndStatusAndCompletionTime(customerId, status, completionTime);
    }

    // Custom query to retrieve credit check by channel, status, and completion time
    public CreditCheck findByChannelAndStatusAndCompletionTime(String channel, String status, String completionTime) {
        return creditCheckRepository.findByChannelAndStatusAndCompletionTime(channel, status, completionTime);
    }

    // Custom query to retrieve credit check by customer ID, channel, status, and completion time
    public CreditCheck findByCustomerIdAndChannelAndStatusAndCompletionTime(Long customerId, String channel, String status, String completionTime) {
        return creditCheckRepository.findByCustomerIdAndChannelAndStatusAndCompletionTime(customerId, channel, status, completionTime);
    }
}