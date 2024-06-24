package com.BAGICLoan.controller;

import com.BAGICLoan.model.LoanApplication;
import com.BAGICLoan.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loan-applications")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/{applicantId}")
    public LoanApplication findByApplicantId(@PathVariable String applicantId) {
        return loanApplicationService.findByApplicantId(applicantId);
    }

    @GetMapping("/credit-score/{creditScore}")
    public List<LoanApplication> findByCreditScoreGreaterThanEqual(@PathVariable int creditScore) {
        return loanApplicationService.findByCreditScoreGreaterThanEqual(creditScore);
    }

    @GetMapping("/loan-amount/{loanAmount}")
    public List<LoanApplication> findByLoanAmountLessThanEqual(@PathVariable double loanAmount) {
        return loanApplicationService.findByLoanAmountLessThanEqual(loanAmount);
    }

    @GetMapping("/interest-rate/{interestRate}")
    public List<LoanApplication> findByInterestRateLessThanEqual(@PathVariable double interestRate) {
        return loanApplicationService.findByInterestRateLessThanEqual(interestRate);
    }

    @GetMapping("/repayment-period/{repaymentPeriod}")
    public List<LoanApplication> findByRepaymentPeriodLessThanEqual(@PathVariable int repaymentPeriod) {
        return loanApplicationService.findByRepaymentPeriodLessThanEqual(repaymentPeriod);
    }

    @GetMapping("/status/{status}")
    public List<LoanApplication> findByStatus(@PathVariable String status) {
        return loanApplicationService.findByStatus(status);
    }

    @GetMapping("/rejected-applications")
    public List<LoanApplication> findRejectedApplicationsWithReason() {
        return loanApplicationService.findRejectedApplicationsWithReason();
    }

    // Additional methods for specific queries or operations can be added here

}