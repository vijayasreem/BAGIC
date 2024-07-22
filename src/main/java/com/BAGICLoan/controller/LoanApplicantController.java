package com.BAGICLoan.controller;

import com.BAGICLoan.model.LoanApplicant;
import com.BAGICLoan.service.LoanApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanApplicantController {

    private final LoanApplicantService loanApplicantService;

    @Autowired
    public LoanApplicantController(LoanApplicantService loanApplicantService) {
        this.loanApplicantService = loanApplicantService;
    }

    @GetMapping("/applicants/credit-score")
    public List<LoanApplicant> findByCreditScoreGreaterThanEqual(@RequestParam int minCreditScore) {
        return loanApplicantService.findByCreditScoreGreaterThanEqual(minCreditScore);
    }

    @GetMapping("/applicants/income")
    public List<LoanApplicant> findByIncomeGreaterThanEqual(@RequestParam double minIncome) {
        return loanApplicantService.findByIncomeGreaterThanEqual(minIncome);
    }

    @GetMapping("/applicants/credit-score-income")
    public List<LoanApplicant> findByCreditScoreAndIncomeGreaterThanEqual(@RequestParam int minCreditScore, @RequestParam double minIncome) {
        return loanApplicantService.findByCreditScoreAndIncomeGreaterThanEqual(minCreditScore, minIncome);
    }

    @GetMapping("/applicants/credit-score-income-age")
    public List<LoanApplicant> findByCreditScoreAndIncomeAndAgeGreaterThanEqual(@RequestParam int minCreditScore, @RequestParam double minIncome, @RequestParam int minAge) {
        return loanApplicantService.findByCreditScoreAndIncomeAndAgeGreaterThanEqual(minCreditScore, minIncome, minAge);
    }

    // Add more endpoints and business methods as per your requirements

}