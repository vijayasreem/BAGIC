package com.BAGICLoan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BAGICLoan.service.ApplicantService;

@RestController
@RequestMapping("/applicant")
public class ApplicantController {

    private ApplicantService applicantService;

    @Autowired
    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @GetMapping("/validate-credit-evaluation/{annualIncome}/{creditScore}")
    public String validateCreditEvaluation(@PathVariable double annualIncome, @PathVariable int creditScore) {
        applicantService.validateCreditEvaluation(annualIncome, creditScore);
        return "Eligibility determination completed.";
    }
}