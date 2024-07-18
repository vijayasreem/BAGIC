package com.BAGICLoan.controller;

import com.BAGICLoan.model.Applicant;
import com.BAGICLoan.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/applicants")
public class ApplicantController {

    private final ApplicantService applicantService;

    @Autowired
    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @GetMapping("/{applicantId}/creditScore")
    public int getCreditScoreById(@PathVariable Long applicantId) {
        return applicantService.getCreditScoreById(applicantId);
    }

    @GetMapping("/{applicantId}/loanAmount")
    public double getLoanAmountById(@PathVariable Long applicantId) {
        return applicantService.getLoanAmountById(applicantId);
    }

    @GetMapping("/{applicantId}/interestRate")
    public double getInterestRateById(@PathVariable Long applicantId) {
        return applicantService.getInterestRateById(applicantId);
    }

    // Add other business methods as needed

}