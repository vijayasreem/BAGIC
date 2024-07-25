
package com.BAGICLoan.repository;

import com.BAGICLoan.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    @Query(value = "SELECT * FROM loan_application WHERE credit_check_status = 'APPROVED'", nativeQuery = true)
    List<LoanApplication> findApprovedLoanApplications();

    @Query(value = "SELECT * FROM loan_application WHERE document_verification_status = 'APPROVED'", nativeQuery = true)
    List<LoanApplication> findApprovedDocumentVerifications();

    // Add more custom queries as per your requirements

}
