
package com.example.crediteligibility.service;

import org.springframework.stereotype.Service;

@Service
public class CreditEligibilityService {

    public String checkEligibility(double annualIncome, int creditScore) {
        if (annualIncome >= 30000 && creditScore >= 700) {
            return "Congratulations! You are eligible for a credit score with a high limit.";
        } else if (annualIncome >= 20000 && creditScore >= 600) {
            return "You are eligible for a credit score with a moderate limit.";
        }
        return "You are not eligible for a credit score.";
    }
}
