package com.BAGICLoan.controller;

import com.BAGICLoan.service.DocumentVerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/document-verification")
public class DocumentVerificationController {

    private final DocumentVerificationService documentVerificationService;

    @Autowired
    public DocumentVerificationController(DocumentVerificationService documentVerificationService) {
        this.documentVerificationService = documentVerificationService;
    }

    @GetMapping("/open-app")
    public String openDocumentVerificationApp() {
        documentVerificationService.openDocumentVerificationApp();
        return "Document Verification App opened successfully!";
    }

    @GetMapping("/verify-identity/{identity}")
    public String verifyIdentity(@PathVariable String identity) {
        return documentVerificationService.verifyIdentity(identity);
    }

    @GetMapping("/verify-address/{address}")
    public String verifyAddress(@PathVariable String address) {
        return documentVerificationService.verifyAddress(address);
    }

    @GetMapping("/determine-eligibility/{identityVerificationResult}/{addressVerificationResult}")
    public String determineEligibilityForBankingServices(@PathVariable String identityVerificationResult, @PathVariable String addressVerificationResult) {
        documentVerificationService.determineEligibilityForBankingServices(identityVerificationResult, addressVerificationResult);
        return "Eligibility determination completed.";
    }

    @GetMapping("/validate-credit/{annualIncome}/{creditScore}")
    public String validateCreditEvaluation(@PathVariable int annualIncome, @PathVariable int creditScore) {
        documentVerificationService.validateCreditEvaluation(annualIncome, creditScore);
        return "Credit evaluation completed.";
    }

    @GetMapping("/close-app")
    public String closeDocumentVerificationApp() {
        documentVerificationService.closeDocumentVerificationApp();
        return "Document Verification App closed successfully!";
    }
}