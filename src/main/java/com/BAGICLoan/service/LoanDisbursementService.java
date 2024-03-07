package com.BAGICLoan.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BAGICLoan.entity.LoanDisbursement;
import com.BAGICLoan.repository.LoanDisbursementRepository;

@Service
public class LoanDisbursementService {
    
    @Autowired
    private LoanDisbursementRepository loanDisbursementRepository;
    
    public LoanDisbursement findByLoanOfferId(Long loanOfferId) {
        return loanDisbursementRepository.findByLoanOfferId(loanOfferId);
    }
    
    public List<LoanDisbursement> findDisbursedLoans() {
        return loanDisbursementRepository.findDisbursedLoans();
    }
    
    public List<LoanDisbursement> findByRecipient(String recipient) {
        return loanDisbursementRepository.findByRecipient(recipient);
    }
    
    public BigDecimal getTotalDisbursedAmount() {
        return loanDisbursementRepository.getTotalDisbursedAmount();
    }
    
    // Add additional methods as per your requirements
    
}