
package com.BAGICLoan.repository;

import com.BAGICLoan.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    // Method to retrieve all loan applications
    List<LoanApplication> findAll();

    // Method to retrieve loan applications by document verification status
    List<LoanApplication> findByDocumentVerified(boolean documentVerified);

    // Method to retrieve loan applications by creditworthiness status
    List<LoanApplication> findByCreditworthinessVerified(boolean creditworthinessVerified);

    // Method to retrieve loan applications by approval status
    List<LoanApplication> findByApproved(boolean approved);

    // Method to retrieve loan applications by applicant's credit score
    List<LoanApplication> findByApplicantCreditScoreGreaterThanEqual(int creditScore);

    // Method to retrieve loan applications by applicant's income
    @Query("SELECT la FROM LoanApplication la WHERE la.applicantIncome >= ?1")
    List<LoanApplication> findByApplicantIncomeGreaterThanEqual(double income);

    // Method to retrieve loan applications by applicant's employment details
    List<LoanApplication> findByApplicantEmploymentDetails(String employmentDetails);
}
