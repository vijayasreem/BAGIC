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
        if (userId == null || userId <= 0) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        AccountDetails accountDetails = accountDetailsService.findByUserId(userId);
        if (accountDetails != null) {
            return new ResponseEntity<>(accountDetails, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Rest of the code remains the same...
}