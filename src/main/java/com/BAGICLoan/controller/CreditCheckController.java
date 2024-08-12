package com.BAGICLoan.controller;

import com.BAGICLoan.model.CreditCheck;
import com.BAGICLoan.service.CreditCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/credit-check")
public class CreditCheckController {

    private final CreditCheckService creditCheckService;

    @Autowired
    public CreditCheckController(CreditCheckService creditCheckService) {
        this.creditCheckService = creditCheckService;
    }

    @GetMapping("/customer/{customerId}")
    public CreditCheck getCreditCheckByCustomerId(@PathVariable Long customerId) {
        return creditCheckService.findByCustomerId(customerId);
    }

    @GetMapping("/channel/{channel}")
    public CreditCheck getCreditCheckByChannel(@PathVariable String channel) {
        return creditCheckService.findByChannel(channel);
    }

    @GetMapping("/status/{status}")
    public CreditCheck getCreditCheckByStatus(@PathVariable String status) {
        return creditCheckService.findByStatus(status);
    }

    @GetMapping("/completion-time/{completionTime}")
    public CreditCheck getCreditCheckByCompletionTime(@PathVariable String completionTime) {
        return creditCheckService.findByCompletionTime(completionTime);
    }

    @GetMapping("/customer/{customerId}/channel/{channel}")
    public CreditCheck getCreditCheckByCustomerIdAndChannel(@PathVariable Long customerId, @PathVariable String channel) {
        return creditCheckService.findByCustomerIdAndChannel(customerId, channel);
    }

    @GetMapping("/customer/{customerId}/status/{status}")
    public CreditCheck getCreditCheckByCustomerIdAndStatus(@PathVariable Long customerId, @PathVariable String status) {
        return creditCheckService.findByCustomerIdAndStatus(customerId, status);
    }

    @GetMapping("/customer/{customerId}/completion-time/{completionTime}")
    public CreditCheck getCreditCheckByCustomerIdAndCompletionTime(@PathVariable Long customerId, @PathVariable String completionTime) {
        return creditCheckService.findByCustomerIdAndCompletionTime(customerId, completionTime);
    }

    @GetMapping("/channel/{channel}/status/{status}")
    public CreditCheck getCreditCheckByChannelAndStatus(@PathVariable String channel, @PathVariable String status) {
        return creditCheckService.findByChannelAndStatus(channel, status);
    }

    @GetMapping("/channel/{channel}/completion-time/{completionTime}")
    public CreditCheck getCreditCheckByChannelAndCompletionTime(@PathVariable String channel, @PathVariable String completionTime) {
        return creditCheckService.findByChannelAndCompletionTime(channel, completionTime);
    }

    @GetMapping("/status/{status}/completion-time/{completionTime}")
    public CreditCheck getCreditCheckByStatusAndCompletionTime(@PathVariable String status, @PathVariable String completionTime) {
        return creditCheckService.findByStatusAndCompletionTime(status, completionTime);
    }

    @GetMapping("/customer/{customerId}/channel/{channel}/status/{status}")
    public CreditCheck getCreditCheckByCustomerIdAndChannelAndStatus(@PathVariable Long customerId, @PathVariable String channel, @PathVariable String status) {
        return creditCheckService.findByCustomerIdAndChannelAndStatus(customerId, channel, status);
    }

    @GetMapping("/customer/{customerId}/channel/{channel}/completion-time/{completionTime}")
    public CreditCheck getCreditCheckByCustomerIdAndChannelAndCompletionTime(@PathVariable Long customerId, @PathVariable String channel, @PathVariable String completionTime) {
        return creditCheckService.findByCustomerIdAndChannelAndCompletionTime(customerId, channel, completionTime);
    }

    @GetMapping("/customer/{customerId}/status/{status}/completion-time/{completionTime}")
    public CreditCheck getCreditCheckByCustomerIdAndStatusAndCompletionTime(@PathVariable Long customerId, @PathVariable String status, @PathVariable String completionTime) {
        return creditCheckService.findByCustomerIdAndStatusAndCompletionTime(customerId, status, completionTime);
    }

    @GetMapping("/channel/{channel}/status/{status}/completion-time/{completionTime}")
    public CreditCheck getCreditCheckByChannelAndStatusAndCompletionTime(@PathVariable String channel, @PathVariable String status, @PathVariable String completionTime) {
        return creditCheckService.findByChannelAndStatusAndCompletionTime(channel, status, completionTime);
    }

    @GetMapping("/customer/{customerId}/channel/{channel}/status/{status}/completion-time/{completionTime}")
    public CreditCheck getCreditCheckByCustomerIdAndChannelAndStatusAndCompletionTime(@PathVariable Long customerId, @PathVariable String channel, @PathVariable String status, @PathVariable String completionTime) {
        return creditCheckService.findByCustomerIdAndChannelAndStatusAndCompletionTime(customerId, channel, status, completionTime);
    }
}