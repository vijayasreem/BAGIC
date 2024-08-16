package com.BAGICLoan.controller;

import com.BAGICLoan.model.DocumentVerification;
import com.BAGICLoan.service.DocumentVerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return "Welcome to the Document Verification App!";
    }

    @PostMapping("/verify-identity")
    public String verifyIdentity(@RequestParam String identity) {
        return documentVerificationService.verifyIdentity(identity);
    }

    @PostMapping("/verify-address")
    public String verifyAddress(@RequestParam String address) {
        return documentVerificationService.verifyAddress(address);
    }

    @PostMapping("/determine-eligibility")
    public String determineEligibilityForBankingServices(@RequestParam String identityVerificationResult, @RequestParam String addressVerificationResult) {
        documentVerificationService.determineEligibilityForBankingServices(identityVerificationResult, addressVerificationResult);
        return "Eligibility determination completed.";
    }

    @PostMapping("/validate-credit")
    public String validateCreditEvaluation(@RequestParam int annualIncome, @RequestParam int creditScore) {
        documentVerificationService.validateCreditEvaluation(annualIncome, creditScore);
        return "Credit evaluation completed.";
    }

    @GetMapping("/close-app")
    public String closeDocumentVerificationApp() {
        documentVerificationService.closeDocumentVerificationApp();
        return "Closing the Document Verification App. Goodbye!";
    }

    @PostMapping("/save")
    public DocumentVerification saveDocumentVerification(@RequestBody DocumentVerification documentVerification) {
        return documentVerificationService.save(documentVerification);
    }
}