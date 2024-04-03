package com.BAGICLoan.service;

import com.BAGICLoan.repository.CreditEvaluation;
import com.BAGICLoan.repository.CreditEvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditEvaluationService {

    private final CreditEvaluationRepository creditEvaluationRepository;

    @Autowired
    public CreditEvaluationService(CreditEvaluationRepository creditEvaluationRepository) {
        this.creditEvaluationRepository = creditEvaluationRepository;
    }

    public void validateCreditEvaluation(Double annualIncome, Integer creditScore) {
        CreditEvaluation creditEvaluation = creditEvaluationRepository.findByAnnualIncomeAndCreditScore(annualIncome, creditScore);

        if (annualIncome >= 30000 && creditScore >= 700) {
            System.out.println("Congratulations! You are eligible for a credit score with a high limit.");
        } else if (annualIncome >= 20000 && creditScore >= 600) {
            System.out.println("You are eligible for a credit score with a moderate limit.");
        } else {
            System.out.println("Sorry, you are not eligible for a credit score.");
        }

        // Close any resources used here
    }
}

Note: The above code assumes that you have defined the CreditEvaluation entity class in the `com.BAGICLoan.repository` package.