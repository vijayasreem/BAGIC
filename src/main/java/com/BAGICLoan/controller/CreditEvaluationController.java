package com.BAGICLoan.controller;

import com.BAGICLoan.service.CreditEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditEvaluationController {

    private final CreditEvaluationService creditEvaluationService;

    @Autowired
    public CreditEvaluationController(CreditEvaluationService creditEvaluationService) {
        this.creditEvaluationService = creditEvaluationService;
    }

    @GetMapping("/credit-evaluation/{annualIncome}/{creditScore}")
    public void validateCreditEvaluation(@PathVariable Double annualIncome, @PathVariable Integer creditScore) {
        creditEvaluationService.validateCreditEvaluation(annualIncome, creditScore);
    }
}

Note: The above code assumes that you have defined the CreditEvaluationService class in the com.BAGICLoan.service package.