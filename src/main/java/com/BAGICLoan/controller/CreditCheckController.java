package com.BAGICLoan.controller;

import com.BAGICLoan.model.Applicant;
import com.BAGICLoan.service.CreditCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/credit-check")
public class CreditCheckController {

    private final CreditCheckService creditCheckService;

    @Autowired
    public CreditCheckController(CreditCheckService creditCheckService) {
        this.creditCheckService = creditCheckService;
    }

    @GetMapping("/applicant/{applicantId}/credit-score")
    public int getApplicantCreditScore(@PathVariable Long applicantId) {
        return creditCheckService.getApplicantCreditScore(applicantId);
    }

    @GetMapping("/applicant/{applicantId}/financial-history")
    public Object[] getApplicantFinancialHistory(@PathVariable Long applicantId) {
        return creditCheckService.getApplicantFinancialHistory(applicantId);
    }

    @GetMapping("/applicant/{applicantId}/creditworthiness-score")
    public int getApplicantCreditworthinessScore(@PathVariable Long applicantId) {
        return creditCheckService.getApplicantCreditworthinessScore(applicantId);
    }

    @GetMapping("/applicant/{applicantId}/creditworthy")
    public boolean isApplicantCreditworthy(@PathVariable Long applicantId) {
        int threshold = 700; // Set the threshold value here
        return creditCheckService.isApplicantCreditworthy(applicantId, threshold);
    }

    @GetMapping("/applicant/{applicantId}/approved")
    public boolean isApplicantApproved(@PathVariable Long applicantId) {
        return creditCheckService.isApplicantApproved(applicantId);
    }

    @GetMapping("/applicant/{applicantId}")
    public Applicant findApplicantById(@PathVariable Long applicantId) {
        return creditCheckService.findApplicantById(applicantId);
    }
}