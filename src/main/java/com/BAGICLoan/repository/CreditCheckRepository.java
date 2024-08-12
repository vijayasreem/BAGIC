
package com.BAGICLoan.repository;

import com.BAGICLoan.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCheckRepository extends JpaRepository<Applicant, Long> {

    @Query("SELECT a.creditScore FROM Applicant a WHERE a.id = :applicantId")
    int getApplicantCreditScore(Long applicantId);

    @Query("SELECT a.paymentHistory, a.outstandingDebts, a.creditUtilization FROM Applicant a WHERE a.id = :applicantId")
    Object[] getApplicantFinancialHistory(Long applicantId);

    @Query("SELECT a.creditworthinessScore FROM Applicant a WHERE a.id = :applicantId")
    int getApplicantCreditworthinessScore(Long applicantId);

    @Query("SELECT a.creditworthinessScore >= :threshold FROM Applicant a WHERE a.id = :applicantId")
    boolean isApplicantCreditworthy(Long applicantId, int threshold);

    @Query("SELECT a.isApproved FROM Applicant a WHERE a.id = :applicantId")
    boolean isApplicantApproved(Long applicantId);

    @Query("SELECT a FROM Applicant a WHERE a.id = :applicantId")
    Applicant findApplicantById(Long applicantId);
}
