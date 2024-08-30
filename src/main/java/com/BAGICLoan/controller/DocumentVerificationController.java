package com.BAGICLoan.controller;

import com.BAGICLoan.service.DocumentVerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentVerificationController {

    private final DocumentVerificationService documentVerificationService;

    @Autowired
    public DocumentVerificationController(DocumentVerificationService documentVerificationService) {
        this.documentVerificationService = documentVerificationService;
    }

    @GetMapping("/openApp")
    public String openDocumentVerificationApp() {
        documentVerificationService.openDocumentVerificationApp();
        return "Welcome to the Document Verification App!";
    }

    @GetMapping("/verifyIdentity/{identity}")
    public String verifyIdentity(@PathVariable String identity) {
        return documentVerificationService.verifyIdentity(identity);
    }

    @GetMapping("/verifyAddress/{address}")
    public String verifyAddress(@PathVariable String address) {
        return documentVerificationService.verifyAddress(address);
    }

    @GetMapping("/determineEligibility")
    public String determineEligibilityForBankingServices() {
        documentVerificationService.determineEligibilityForBankingServices();
        return "Eligibility determined for banking services.";
    }

    @GetMapping("/validateCredit/{annualIncome}/{creditScore}")
    public String validateCreditEvaluation(@PathVariable int annualIncome, @PathVariable int creditScore) {
        documentVerificationService.validateCreditEvaluation(annualIncome, creditScore);
        return "Credit evaluation validated.";
    }

    @GetMapping("/closeApp")
    public String closeDocumentVerificationApp() {
        documentVerificationService.closeDocumentVerificationApp();
        return "Closing the Document Verification App. Goodbye!";
    }
}