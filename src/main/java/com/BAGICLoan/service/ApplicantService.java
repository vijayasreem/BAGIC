package com.BAGICLoan.service;

import com.BAGICLoan.model.Applicant;
import com.BAGICLoan.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantService {

    private final ApplicantRepository applicantRepository;

    @Autowired
    public ApplicantService(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    public List<Applicant> findByCreditScoreAndFinancialHistory(int minCreditScore, String financialHistory) {
        return applicantRepository.findByCreditScoreAndFinancialHistory(minCreditScore, financialHistory);
    }

    public Double calculateAverageLoanAmount(int minCreditScore, String financialHistory) {
        return applicantRepository.calculateAverageLoanAmount(minCreditScore, financialHistory);
    }

    public Double findMinInterestRate(int minCreditScore, String financialHistory) {
        return applicantRepository.findMinInterestRate(minCreditScore, financialHistory);
    }

    public Double findMaxInterestRate(int minCreditScore, String financialHistory) {
        return applicantRepository.findMaxInterestRate(minCreditScore, financialHistory);
    }
}