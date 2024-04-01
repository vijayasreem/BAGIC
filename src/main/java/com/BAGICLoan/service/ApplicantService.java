package com.BAGICLoan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BAGICLoan.model.Applicant;
import com.BAGICLoan.repository.ApplicantRepository;

@Service
public class ApplicantService {

    private ApplicantRepository applicantRepository;

    @Autowired
    public ApplicantService(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    public void validateCreditEvaluation(double annualIncome, int creditScore) {
        Applicant applicant = applicantRepository.findByIncomeAndCreditScore(annualIncome, creditScore);
        
        if (applicant != null) {
            if (annualIncome >= 30000 && creditScore >= 700) {
                System.out.println("Congratulations! You are eligible for a credit score with a high limit.");
            } else if (annualIncome >= 20000 && creditScore >= 600) {
                System.out.println("Congratulations! You are eligible for a credit score with a moderate limit.");
            } else {
                System.out.println("Sorry, you are not eligible for a credit score.");
            }
        } else {
            System.out.println("No applicant found with the given income and credit score.");
        }
    }
}