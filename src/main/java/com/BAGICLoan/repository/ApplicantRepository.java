
package com.BAGICLoan.repository;

import com.BAGICLoan.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

    @Query("SELECT a FROM Applicant a WHERE a.creditScore >= :minCreditScore AND a.financialHistory = :financialHistory")
    List<Applicant> findByCreditScoreAndFinancialHistory(int minCreditScore, String financialHistory);

    @Query("SELECT AVG(a.loanAmount) FROM Applicant a WHERE a.creditScore >= :minCreditScore AND a.financialHistory = :financialHistory")
    Double calculateAverageLoanAmount(int minCreditScore, String financialHistory);

    @Query("SELECT MIN(a.interestRate) FROM Applicant a WHERE a.creditScore >= :minCreditScore AND a.financialHistory = :financialHistory")
    Double findMinInterestRate(int minCreditScore, String financialHistory);

    @Query("SELECT MAX(a.interestRate) FROM Applicant a WHERE a.creditScore >= :minCreditScore AND a.financialHistory = :financialHistory")
    Double findMaxInterestRate(int minCreditScore, String financialHistory);
}
