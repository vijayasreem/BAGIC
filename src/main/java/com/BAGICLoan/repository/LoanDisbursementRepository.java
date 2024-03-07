
package com.BAGICLoan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.BAGICLoan.entity.LoanDisbursement;

public interface LoanDisbursementRepository extends JpaRepository<LoanDisbursement, Long> {

    @Query("SELECT ld FROM LoanDisbursement ld WHERE ld.loanOfferId = ?1")
    LoanDisbursement findByLoanOfferId(Long loanOfferId);

    @Query("SELECT ld FROM LoanDisbursement ld WHERE ld.status = 'DISBURSED'")
    List<LoanDisbursement> findDisbursedLoans();

    @Query("SELECT ld FROM LoanDisbursement ld WHERE ld.recipient = ?1")
    List<LoanDisbursement> findByRecipient(String recipient);

    @Query("SELECT SUM(ld.amount) FROM LoanDisbursement ld WHERE ld.status = 'DISBURSED'")
    BigDecimal getTotalDisbursedAmount();

    // Add additional methods as per your requirements

}
