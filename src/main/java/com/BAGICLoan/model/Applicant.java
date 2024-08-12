
package com.BAGICLoan.model;

import javax.persistence.*;

@Entity
@Table(name = "applicant")
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "credit_score")
    private int creditScore;

    @Column(name = "payment_history")
    private String paymentHistory;

    @Column(name = "outstanding_debts")
    private double outstandingDebts;

    @Column(name = "credit_utilization")
    private double creditUtilization;

    @Column(name = "creditworthiness_score")
    private int creditworthinessScore;

    @Column(name = "is_approved")
    private boolean isApproved;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String getPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(String paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    public double getOutstandingDebts() {
        return outstandingDebts;
    }

    public void setOutstandingDebts(double outstandingDebts) {
        this.outstandingDebts = outstandingDebts;
    }

    public double getCreditUtilization() {
        return creditUtilization;
    }

    public void setCreditUtilization(double creditUtilization) {
        this.creditUtilization = creditUtilization;
    }

    public int getCreditworthinessScore() {
        return creditworthinessScore;
    }

    public void setCreditworthinessScore(int creditworthinessScore) {
        this.creditworthinessScore = creditworthinessScore;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }
}
