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

    public List<LoanApplication> findByInPersonChannel() {
        return loanApplicationRepository.findByInPersonChannel();
    }

    public List<LoanApplication> findByWebsiteChannel() {
        return loanApplicationRepository.findByWebsiteChannel();
    }

    public List<LoanApplication> findByMobileAppChannel() {
        return loanApplicationRepository.findByMobileAppChannel();
    }

    // Add more business methods as needed

}