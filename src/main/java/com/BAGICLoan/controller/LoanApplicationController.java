package com.BAGICLoan.controller;

import com.BAGICLoan.model.LoanApplication;
import com.BAGICLoan.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loanApplications")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/{applicantId}")
    public LoanApplication getLoanApplicationByApplicantId(@PathVariable Long applicantId) {
        return loanApplicationService.getLoanApplicationByApplicantId(applicantId);
    }

    @GetMapping("/creditScore/{creditScore}")
    public List<LoanApplication> getLoanApplicationsWithCreditScoreGreaterThanEqual(@PathVariable int creditScore) {
        return loanApplicationService.getLoanApplicationsWithCreditScoreGreaterThanEqual(creditScore);
    }

    @GetMapping("/approved")
    public List<LoanApplication> getApprovedLoanApplications() {
        return loanApplicationService.getApprovedLoanApplications();
    }

    @GetMapping("/approved/{applicantId}")
    public LoanApplication getApprovedLoanApplicationByApplicantId(@PathVariable Long applicantId) {
        return loanApplicationService.getApprovedLoanApplicationByApplicantId(applicantId);
    }

    // Add more request mapping methods for additional business methods as per your requirements

}