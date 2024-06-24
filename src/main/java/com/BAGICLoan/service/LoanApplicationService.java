package com.BAGICLoan.service;

import com.BAGICLoan.model.LoanApplication;
import com.BAGICLoan.repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanApplicationService {

    private final LoanApplicationRepository loanApplicationRepository;

    @Autowired
    public LoanApplicationService(LoanApplicationRepository loanApplicationRepository) {
        this.loanApplicationRepository = loanApplicationRepository;
    }

    public LoanApplication findByApplicantId(String applicantId) {
        return loanApplicationRepository.findByApplicantId(applicantId);
    }

    public List<LoanApplication> findByCreditScoreGreaterThanEqual(int creditScore) {
        return loanApplicationRepository.findByCreditScoreGreaterThanEqual(creditScore);
    }

    public List<LoanApplication> findByLoanAmountLessThanEqual(double loanAmount) {
        return loanApplicationRepository.findByLoanAmountLessThanEqual(loanAmount);
    }

    public List<LoanApplication> findByInterestRateLessThanEqual(double interestRate) {
        return loanApplicationRepository.findByInterestRateLessThanEqual(interestRate);
    }

    public List<LoanApplication> findByRepaymentPeriodLessThanEqual(int repaymentPeriod) {
        return loanApplicationRepository.findByRepaymentPeriodLessThanEqual(repaymentPeriod);
    }

    public List<LoanApplication> findByStatus(String status) {
        return loanApplicationRepository.findByStatus(status);
    }

    public List<LoanApplication> findRejectedApplicationsWithReason() {
        return loanApplicationRepository.findRejectedApplicationsWithReason();
    }

    // Additional methods for specific queries or operations can be added here

}