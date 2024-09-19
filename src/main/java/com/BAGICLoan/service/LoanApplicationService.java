
package com.bank.loan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bank.loan.model.LoanApplication;
import com.bank.loan.repository.LoanApplicationRepository;

@Service
public class LoanApplicationService {

    @Autowired
    private LoanApplicationRepository loanApplicationRepository;

    public LoanApplication saveLoanApplication(LoanApplication loanApplication) {
        return loanApplicationRepository.save(loanApplication);
    }

    public LoanApplication getLoanApplication(Long id) {
        return loanApplicationRepository.findById(id).orElse(null);
    }

    public void sendConfirmationEmail(LoanApplication loanApplication) {
        // Simulate sending email
        System.out.println("Confirmation email sent to " + loanApplication.getEmail());
    }
}
