
package com.BAGICLoan.controller;

import com.BAGICLoan.service.DocumentVerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/document-verification")
public class DocumentVerificationController {

    @Autowired
    private DocumentVerificationService service;

    @GetMapping("/open")
    public String openApp() {
        service.openApp();
        return "Welcome to the Document Verification App!";
    }

    @PostMapping("/verify")
    public String verifyDocuments(@RequestParam String identity, @RequestParam String address) {
        String identityResult = service.verifyIdentity(identity);
        String addressResult = service.verifyAddress(address);

        if ("yes".equals(identityResult) && "yes".equals(addressResult)) {
            service.checkEligibility(identity, address);
            return "Document verification successful. You are eligible for banking services.";
        } else {
            return "Document verification incomplete. You are not eligible for banking services.";
        }
    }

    @PostMapping("/validate-credit")
    public String validateCredit(@RequestParam double annualIncome, @RequestParam int creditScore) {
        if (annualIncome >= 30000 && creditScore >= 700) {
            service.validateCreditEvaluation(annualIncome, creditScore);
            return "Congratulations! You are eligible for a high-limit credit score.";
        } else if (annualIncome >= 20000 && creditScore >= 600) {
            service.validateCreditEvaluation(annualIncome, creditScore);
            return "You are eligible for a moderate-limit credit score.";
        } else {
            return "You are not eligible for a high-limit or moderate-limit credit score.";
        }
    }

    @GetMapping("/close")
    public String closeApp() {
        service.closeApp();
        return "Application closed successfully.";
    }
}
