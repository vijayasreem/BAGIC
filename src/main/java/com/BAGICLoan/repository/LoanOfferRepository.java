
package com.BAGICLoan.repository;

import com.BAGICLoan.model.LoanOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanOfferRepository extends JpaRepository<LoanOffer, Long> {

    @Query("SELECT lo FROM LoanOffer lo WHERE lo.loanAmount = ?1")
    LoanOffer findByLoanAmount(double loanAmount);

    @Query("SELECT lo FROM LoanOffer lo WHERE lo.interestRate = ?1")
    LoanOffer findByInterestRate(double interestRate);

    @Query("SELECT lo FROM LoanOffer lo WHERE lo.repaymentPeriod = ?1")
    LoanOffer findByRepaymentPeriod(int repaymentPeriod);

    // Add more custom queries as per your requirements

}
