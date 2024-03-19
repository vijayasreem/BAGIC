package com.BAGICLoan.repository;

import com.BAGICLoan.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    // Custom query to retrieve loan applications by application type
    @Query("SELECT l FROM LoanApplication l WHERE l.applicationType = ?1")
    List<LoanApplication> findByApplicationType(String applicationType);

    // Custom query to retrieve loan applications by approval status
    @Query("SELECT l FROM LoanApplication l WHERE l.approvalStatus = ?1")
    List<LoanApplication> findByApprovalStatus(String approvalStatus);

    // Custom query to retrieve loan applications by applicant ID
    @Query("SELECT l FROM LoanApplication l WHERE l.applicantId = ?1")
    List<LoanApplication> findByApplicantId(Long applicantId);

    // Custom query to retrieve loan applications by applicant name
    @Query("SELECT l FROM LoanApplication l WHERE l.applicantName = ?1")
    List<LoanApplication> findByApplicantName(String applicantName);

    // Custom query to retrieve loan applications by applicant email
    @Query("SELECT l FROM LoanApplication l WHERE l.applicantEmail = ?1")
    List<LoanApplication> findByApplicantEmail(String applicantEmail);

    // Custom query to update loan application
    @Modifying
    @Query("UPDATE LoanApplication l SET l.applicationType = ?1, l.approvalStatus = ?2, l.applicantId = ?3, l.applicantName = ?4, l.applicantEmail = ?5 WHERE l.id = ?6")
    LoanApplication updateLoanApplication(String applicationType, String approvalStatus, Long applicantId, String applicantName, String applicantEmail, Long id);
}