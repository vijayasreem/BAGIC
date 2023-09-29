
package com.BAGICLoan.repository;

import com.BAGICLoan.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
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
}
