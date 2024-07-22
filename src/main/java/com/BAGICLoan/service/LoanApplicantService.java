package com.BAGICLoan.service;

import com.BAGICLoan.model.LoanApplicant;
import com.BAGICLoan.repository.LoanApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanApplicantService {

    private final LoanApplicantRepository loanApplicantRepository;

    @Autowired
    public LoanApplicantService(LoanApplicantRepository loanApplicantRepository) {
        this.loanApplicantRepository = loanApplicantRepository;
    }

    public List<LoanApplicant> findByCreditScoreGreaterThanEqual(int minCreditScore) {
        return loanApplicantRepository.findByCreditScoreGreaterThanEqual(minCreditScore);
    }

    public List<LoanApplicant> findByIncomeGreaterThanEqual(double minIncome) {
        return loanApplicantRepository.findByIncomeGreaterThanEqual(minIncome);
    }

    public List<LoanApplicant> findByCreditScoreAndIncomeGreaterThanEqual(int minCreditScore, double minIncome) {
        return loanApplicantRepository.findByCreditScoreAndIncomeGreaterThanEqual(minCreditScore, minIncome);
    }

    public List<LoanApplicant> findByCreditScoreAndIncomeAndAgeGreaterThanEqual(int minCreditScore, double minIncome, int minAge) {
        return loanApplicantRepository.findByCreditScoreAndIncomeAndAgeGreaterThanEqual(minCreditScore, minIncome, minAge);
    }

    // Add more business methods as per your requirements

}