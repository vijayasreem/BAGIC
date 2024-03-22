
package com.BAGICLoan.repository;

import com.BAGICLoan.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    @Query("SELECT la FROM LoanApplication la WHERE la.applicantId = ?1")
    LoanApplication findByApplicantId(Long applicantId);

    @Query("SELECT la FROM LoanApplication la WHERE la.creditScore >= ?1")
    List<LoanApplication> findByCreditScoreGreaterThanEqual(int creditScore);

    @Query("SELECT la FROM LoanApplication la WHERE la.status = 'APPROVED'")
    List<LoanApplication> findApprovedLoanApplications();

    @Query("SELECT la FROM LoanApplication la WHERE la.status = 'APPROVED' AND la.applicantId = ?1")
    LoanApplication findApprovedLoanApplicationByApplicantId(Long applicantId);

    // You can add more custom queries as per your requirements

}
