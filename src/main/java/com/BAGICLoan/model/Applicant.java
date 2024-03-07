package com.BAGICLoan.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "applicant")
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "credit_score")
    private int creditScore;

    @Column(name = "financial_history")
    private String financialHistory;

    @Column(name = "loan_amount")
    private double loanAmount;

    @Column(name = "interest_rate")
    private double interestRate;

    public Applicant() {
    }

    public Applicant(int creditScore, String financialHistory, double loanAmount, double interestRate) {
        this.creditScore = creditScore;
        this.financialHistory = financialHistory;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

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

    public String getFinancialHistory() {
        return financialHistory;
    }

    public void setFinancialHistory(String financialHistory) {
        this.financialHistory = financialHistory;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Applicant applicant = (Applicant) o;
        return creditScore == applicant.creditScore && Double.compare(applicant.loanAmount, loanAmount) == 0 && Double.compare(applicant.interestRate, interestRate) == 0 && Objects.equals(id, applicant.id) && Objects.equals(financialHistory, applicant.financialHistory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, creditScore, financialHistory, loanAmount, interestRate);
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "id=" + id +
                ", creditScore=" + creditScore +
                ", financialHistory='" + financialHistory + '\'' +
                ", loanAmount=" + loanAmount +
                ", interestRate=" + interestRate +
                '}';
    }
}