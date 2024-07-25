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

    public List<LoanApplication> findApprovedLoanApplications() {
        return loanApplicationRepository.findApprovedLoanApplications();
    }

    public List<LoanApplication> findApprovedDocumentVerifications() {
        return loanApplicationRepository.findApprovedDocumentVerifications();
    }

    // Add more business methods as per your requirements

}