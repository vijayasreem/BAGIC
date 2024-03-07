package com.BAGICLoan.controller;

import com.BAGICLoan.model.Applicant;
import com.BAGICLoan.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicantController {

    private final ApplicantService applicantService;

    @Autowired
    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @GetMapping("/prequalify")
    public String prequalifyApplicant(@RequestParam int creditScore, @RequestParam String financialHistory) {
        List<Applicant> qualifiedApplicants = applicantService.findByCreditScoreAndFinancialHistory(creditScore, financialHistory);
        Double averageLoanAmount = applicantService.calculateAverageLoanAmount(creditScore, financialHistory);
        Double minInterestRate = applicantService.findMinInterestRate(creditScore, financialHistory);
        Double maxInterestRate = applicantService.findMaxInterestRate(creditScore, financialHistory);

        StringBuilder result = new StringBuilder();
        result.append("Pre-qualification results:\n");
        result.append("Qualified applicants: ").append(qualifiedApplicants.size()).append("\n");
        result.append("Average loan amount: ").append(averageLoanAmount).append("\n");
        result.append("Minimum interest rate: ").append(minInterestRate).append("%\n");
        result.append("Maximum interest rate: ").append(maxInterestRate).append("%\n");

        return result.toString();
    }
}