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

    public List<LoanApplication> getLoanApplicationsByApplicationType(String applicationType) {
        return loanApplicationRepository.findByApplicationType(applicationType);
    }

    public List<LoanApplication> getLoanApplicationsByApprovalStatus(String approvalStatus) {
        return loanApplicationRepository.findByApprovalStatus(approvalStatus);
    }

    public List<LoanApplication> getLoanApplicationsByApplicantId(Long applicantId) {
        return loanApplicationRepository.findByApplicantId(applicantId);
    }

    public List<LoanApplication> getLoanApplicationsByApplicantName(String applicantName) {
        return loanApplicationRepository.findByApplicantName(applicantName);
    }

    public List<LoanApplication> getLoanApplicationsByApplicantEmail(String applicantEmail) {
        return loanApplicationRepository.findByApplicantEmail(applicantEmail);
    }

    // Other business methods can be added here
}