
package com.BAGICLoan.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DocumentVerificationRepository {

    public void openDocumentVerificationApp() {
        System.out.println("Welcome to the Document Verification App");
    }

    public String verifyIdentity(String identity) {
        return identity != null && !identity.isEmpty() ? "yes" : "no";
    }

    public String verifyAddress(String address) {
        return address != null && !address.isEmpty() ? "yes" : "no";
    }

    public void checkEligibility(String identity, String address) {
        String identityVerified = verifyIdentity(identity);
        String addressVerified = verifyAddress(address);

        if ("yes".equals(identityVerified) && "yes".equals(addressVerified)) {
            System.out.println("Document verification successful. You are eligible for banking services.");
        } else {
            System.out.println("Incomplete document verification. You are not eligible for banking services.");
        }
    }

    public void validateCreditEvaluation(double annualIncome, int creditScore) {
        if (annualIncome >= 30000 && creditScore >= 700) {
            System.out.println("Congratulations! You are eligible for a high-limit credit score.");
        } else if (annualIncome >= 20000 && creditScore >= 600) {
            System.out.println("You are eligible for a moderate-limit credit score.");
        } else {
            System.out.println("You are not eligible for a high-limit or moderate-limit credit score.");
        }
    }

    public void closeApplication() {
        System.out.println("Closing application. Thank you for using our services.");
    }
}
