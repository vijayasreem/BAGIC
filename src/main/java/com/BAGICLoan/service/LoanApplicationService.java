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

    // Method to retrieve all loan applications
    public List<LoanApplication> getAllLoanApplications() {
        return loanApplicationRepository.findAll();
    }

    // Method to retrieve loan applications by document verification status
    public List<LoanApplication> getLoanApplicationsByDocumentVerificationStatus(boolean documentVerified) {
        return loanApplicationRepository.findByDocumentVerified(documentVerified);
    }

    // Method to retrieve loan applications by creditworthiness status
    public List<LoanApplication> getLoanApplicationsByCreditworthinessVerificationStatus(boolean creditworthinessVerified) {
        return loanApplicationRepository.findByCreditworthinessVerified(creditworthinessVerified);
    }

    // Method to retrieve loan applications by approval status
    public List<LoanApplication> getLoanApplicationsByApprovalStatus(boolean approved) {
        return loanApplicationRepository.findByApproved(approved);
    }

    // Method to retrieve loan applications by applicant's credit score
    public List<LoanApplication> getLoanApplicationsByApplicantCreditScore(int creditScore) {
        return loanApplicationRepository.findByApplicantCreditScoreGreaterThanEqual(creditScore);
    }

    // Method to retrieve loan applications by applicant's income
    public List<LoanApplication> getLoanApplicationsByApplicantIncome(double income) {
        return loanApplicationRepository.findByApplicantIncomeGreaterThanEqual(income);
    }

    // Method to retrieve loan applications by applicant's employment details
    public List<LoanApplication> getLoanApplicationsByApplicantEmploymentDetails(String employmentDetails) {
        return loanApplicationRepository.findByApplicantEmploymentDetails(employmentDetails);
    }
}