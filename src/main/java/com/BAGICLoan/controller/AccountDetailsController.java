package com.BAGICLoan.controller;

import com.BAGICLoan.model.AccountDetails;
import com.BAGICLoan.service.AccountDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountDetailsController {

    private final AccountDetailsService accountDetailsService;

    @Autowired
    public AccountDetailsController(AccountDetailsService accountDetailsService) {
        this.accountDetailsService = accountDetailsService;
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<AccountDetails> getAccountDetailsByUserId(@PathVariable Long userId) {
        AccountDetails accountDetails = accountDetailsService.findByUserId(userId);
        if (accountDetails != null) {
            return new ResponseEntity<>(accountDetails, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<AccountDetails> getAccountDetailsByEmail(@PathVariable String email) {
        AccountDetails accountDetails = accountDetailsService.findByEmail(email);
        if (accountDetails != null) {
            return new ResponseEntity<>(accountDetails, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/mobile/{mobileNumber}")
    public ResponseEntity<AccountDetails> getAccountDetailsByMobileNumber(@PathVariable String mobileNumber) {
        AccountDetails accountDetails = accountDetailsService.findByMobileNumber(mobileNumber);
        if (accountDetails != null) {
            return new ResponseEntity<>(accountDetails, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/phone/{phoneNumber}")
    public ResponseEntity<AccountDetails> getAccountDetailsByPhoneNumber(@PathVariable String phoneNumber) {
        AccountDetails accountDetails = accountDetailsService.findByPhoneNumber(phoneNumber);
        if (accountDetails != null) {
            return new ResponseEntity<>(accountDetails, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/aadhar/{aadharNumber}")
    public ResponseEntity<AccountDetails> getAccountDetailsByAadharNumber(@PathVariable String aadharNumber) {
        AccountDetails accountDetails = accountDetailsService.findByAadharNumber(aadharNumber);
        if (accountDetails != null) {
            return new ResponseEntity<>(accountDetails, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/{userId}")
    public ResponseEntity<AccountDetails> updateAccountDetails(@PathVariable Long userId,
                                                               @RequestParam String name,
                                                               @RequestParam String pin) {
        AccountDetails updatedAccountDetails = accountDetailsService.updateAccountDetails(userId, name, pin);
        if (updatedAccountDetails != null) {
            return new ResponseEntity<>(updatedAccountDetails, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}