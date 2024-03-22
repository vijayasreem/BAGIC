
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

    public LoanApplication getLoanApplicationByApplicantId(Long applicantId) {
        return loanApplicationRepository.findByApplicantId(applicantId);
    }

    public List<LoanApplication> getLoanApplicationsWithCreditScoreGreaterThanEqual(int creditScore) {
        return loanApplicationRepository.findByCreditScoreGreaterThanEqual(creditScore);
    }

    public List<LoanApplication> getApprovedLoanApplications() {
        return loanApplicationRepository.findApprovedLoanApplications();
    }

    public LoanApplication getApprovedLoanApplicationByApplicantId(Long applicantId) {
        return loanApplicationRepository.findApprovedLoanApplicationByApplicantId(applicantId);
    }

    // Add more business methods as per your requirements

}
