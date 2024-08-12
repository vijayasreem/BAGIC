package com.BAGICLoan.service;

import com.BAGICLoan.model.Applicant;
import com.BAGICLoan.repository.CreditCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditCheckService {

    private final CreditCheckRepository creditCheckRepository;

    @Autowired
    public CreditCheckService(CreditCheckRepository creditCheckRepository) {
        this.creditCheckRepository = creditCheckRepository;
    }

    public int getApplicantCreditScore(Long applicantId) {
        return creditCheckRepository.getApplicantCreditScore(applicantId);
    }

    public Object[] getApplicantFinancialHistory(Long applicantId) {
        return creditCheckRepository.getApplicantFinancialHistory(applicantId);
    }

    public int getApplicantCreditworthinessScore(Long applicantId) {
        return creditCheckRepository.getApplicantCreditworthinessScore(applicantId);
    }

    public boolean isApplicantCreditworthy(Long applicantId, int threshold) {
        return creditCheckRepository.isApplicantCreditworthy(applicantId, threshold);
    }

    public boolean isApplicantApproved(Long applicantId) {
        return creditCheckRepository.isApplicantApproved(applicantId);
    }

    public Applicant findApplicantById(Long applicantId) {
        return creditCheckRepository.findApplicantById(applicantId);
    }
}