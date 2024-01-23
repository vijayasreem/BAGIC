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

In the above controller class, I have created RESTful endpoints for accessing and updating account details. The methods are mapped to different paths and HTTP methods using annotations such as @GetMapping and @PutMapping.

The getAccountDetailsByUserId, getAccountDetailsByEmail, getAccountDetailsByMobileNumber, and getAccountDetailsByAadharNumber methods retrieve account details based on the provided parameters and return a ResponseEntity with the account details if found, or a ResponseEntity with HTTP status NOT_FOUND if not found.

The updateAccountDetails method allows users to update their account details by providing the user ID, name, and PIN as request parameters. The method calls the corresponding service method to perform the update and returns a ResponseEntity with the updated account details if successful, or a ResponseEntity with HTTP status NOT_FOUND if the account details are not found.

You can now use this controller class to handle requests related to account details in your Spring Boot application.