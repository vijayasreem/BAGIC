
package com.BAGICLoan.repository;

import com.BAGICLoan.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    @Query("SELECT la FROM LoanApplication la WHERE la.applicantId = ?1")
    LoanApplication findByApplicantId(String applicantId);

    @Query("SELECT la FROM LoanApplication la WHERE la.creditScore >= ?1")
    List<LoanApplication> findByCreditScoreGreaterThanEqual(int creditScore);

    @Query("SELECT la FROM LoanApplication la WHERE la.loanAmount <= ?1")
    List<LoanApplication> findByLoanAmountLessThanEqual(double loanAmount);

    @Query("SELECT la FROM LoanApplication la WHERE la.interestRate <= ?1")
    List<LoanApplication> findByInterestRateLessThanEqual(double interestRate);

    @Query("SELECT la FROM LoanApplication la WHERE la.repaymentPeriod <= ?1")
    List<LoanApplication> findByRepaymentPeriodLessThanEqual(int repaymentPeriod);

    @Query("SELECT la FROM LoanApplication la WHERE la.status = ?1")
    List<LoanApplication> findByStatus(String status);

    @Query("SELECT la FROM LoanApplication la WHERE la.status = 'Rejected' AND la.rejectionReason IS NOT NULL")
    List<LoanApplication> findRejectedApplicationsWithReason();

    // Additional methods for specific queries or operations can be added here

}
