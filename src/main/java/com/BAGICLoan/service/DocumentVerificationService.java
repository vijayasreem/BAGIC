
package com.BAGICLoan.service;

import com.BAGICLoan.repository.DocumentVerificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentVerificationService {

    @Autowired
    private DocumentVerificationRepository repository;

    public void openApp() {
        repository.openDocumentVerificationApp();
    }

    public String verifyIdentity(String identity) {
        return repository.verifyIdentity(identity);
    }

    public String verifyAddress(String address) {
        return repository.verifyAddress(address);
    }

    public void checkEligibility(String identity, String address) {
        repository.checkEligibility(identity, address);
    }

    public void validateCreditEvaluation(double annualIncome, int creditScore) {
        repository.validateCreditEvaluation(annualIncome, creditScore);
    }

    public void closeApp() {
        repository.closeApplication();
    }
}
