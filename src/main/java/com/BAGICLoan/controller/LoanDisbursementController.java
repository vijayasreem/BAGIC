package com.BAGICLoan.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BAGICLoan.entity.LoanDisbursement;
import com.BAGICLoan.service.LoanDisbursementService;

@RestController
@RequestMapping("/loan-disbursement")
public class LoanDisbursementController {
    
    @Autowired
    private LoanDisbursementService loanDisbursementService;
    
    @GetMapping("/loan-offer/{loanOfferId}")
    public LoanDisbursement findByLoanOfferId(@PathVariable Long loanOfferId) {
        return loanDisbursementService.findByLoanOfferId(loanOfferId);
    }
    
    @GetMapping("/disbursed-loans")
    public List<LoanDisbursement> findDisbursedLoans() {
        return loanDisbursementService.findDisbursedLoans();
    }
    
    @GetMapping("/recipient/{recipient}")
    public List<LoanDisbursement> findByRecipient(@PathVariable String recipient) {
        return loanDisbursementService.findByRecipient(recipient);
    }
    
    @GetMapping("/total-disbursed-amount")
    public BigDecimal getTotalDisbursedAmount() {
        return loanDisbursementService.getTotalDisbursedAmount();
    }
    
    // Add additional methods as per your requirements
    
}