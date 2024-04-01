
package com.BAGICLoan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean documentVerified;
    private boolean creditworthinessVerified;
    private boolean approved;
    private int applicantCreditScore;
    private double applicantIncome;
    private String applicantEmploymentDetails;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isDocumentVerified() {
        return documentVerified;
    }

    public void setDocumentVerified(boolean documentVerified) {
        this.documentVerified = documentVerified;
    }

    public boolean isCreditworthinessVerified() {
        return creditworthinessVerified;
    }

    public void setCreditworthinessVerified(boolean creditworthinessVerified) {
        this.creditworthinessVerified = creditworthinessVerified;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public int getApplicantCreditScore() {
        return applicantCreditScore;
    }

    public void setApplicantCreditScore(int applicantCreditScore) {
        this.applicantCreditScore = applicantCreditScore;
    }

    public double getApplicantIncome() {
        return applicantIncome;
    }

    public void setApplicantIncome(double applicantIncome) {
        this.applicantIncome = applicantIncome;
    }

    public String getApplicantEmploymentDetails() {
        return applicantEmploymentDetails;
    }

    public void setApplicantEmploymentDetails(String applicantEmploymentDetails) {
        this.applicantEmploymentDetails = applicantEmploymentDetails;
    }
}
