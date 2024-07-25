package com.BAGICLoan.controller;

import com.BAGICLoan.model.LoanApplication;
import com.BAGICLoan.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/loan-applications")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/approved")
    public List<LoanApplication> getApprovedLoanApplications() {
        return loanApplicationService.findApprovedLoanApplications();
    }

    @GetMapping("/document-verifications")
    public List<LoanApplication> getApprovedDocumentVerifications() {
        return loanApplicationService.findApprovedDocumentVerifications();
    }

    // Add more API endpoints for other business methods as per your requirements

}