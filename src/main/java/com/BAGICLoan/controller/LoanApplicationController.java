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

    @GetMapping
    public List<LoanApplication> getAllLoanApplications() {
        return loanApplicationService.getAllLoanApplications();
    }

    @GetMapping("/document-verification/{documentVerified}")
    public List<LoanApplication> getLoanApplicationsByDocumentVerificationStatus(@PathVariable boolean documentVerified) {
        return loanApplicationService.getLoanApplicationsByDocumentVerificationStatus(documentVerified);
    }

    @GetMapping("/creditworthiness-verification/{creditworthinessVerified}")
    public List<LoanApplication> getLoanApplicationsByCreditworthinessVerificationStatus(@PathVariable boolean creditworthinessVerified) {
        return loanApplicationService.getLoanApplicationsByCreditworthinessVerificationStatus(creditworthinessVerified);
    }

    @GetMapping("/approval/{approved}")
    public List<LoanApplication> getLoanApplicationsByApprovalStatus(@PathVariable boolean approved) {
        return loanApplicationService.getLoanApplicationsByApprovalStatus(approved);
    }

    @GetMapping("/applicant-credit-score/{creditScore}")
    public List<LoanApplication> getLoanApplicationsByApplicantCreditScore(@PathVariable int creditScore) {
        return loanApplicationService.getLoanApplicationsByApplicantCreditScore(creditScore);
    }

    @GetMapping("/applicant-income/{income}")
    public List<LoanApplication> getLoanApplicationsByApplicantIncome(@PathVariable double income) {
        return loanApplicationService.getLoanApplicationsByApplicantIncome(income);
    }

    @GetMapping("/applicant-employment-details/{employmentDetails}")
    public List<LoanApplication> getLoanApplicationsByApplicantEmploymentDetails(@PathVariable String employmentDetails) {
        return loanApplicationService.getLoanApplicationsByApplicantEmploymentDetails(employmentDetails);
    }
}