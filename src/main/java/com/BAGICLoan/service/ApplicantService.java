package com.BAGICLoan.service;

import com.BAGICLoan.model.Applicant;
import com.BAGICLoan.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicantService {

    private final ApplicantRepository applicantRepository;

    @Autowired
    public ApplicantService(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    public int getCreditScoreById(Long applicantId) {
        return applicantRepository.getCreditScoreById(applicantId);
    }

    public double getLoanAmountById(Long applicantId) {
        return applicantRepository.getLoanAmountById(applicantId);
    }

    public double getInterestRateById(Long applicantId) {
        return applicantRepository.getInterestRateById(applicantId);
    }

    // Add other business methods as needed

}