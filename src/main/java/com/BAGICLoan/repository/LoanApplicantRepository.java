
package com.BAGICLoan.repository;

import com.BAGICLoan.model.LoanApplicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanApplicantRepository extends JpaRepository<LoanApplicant, Long> {

    @Query("SELECT l FROM LoanApplicant l WHERE l.creditScore >= :minCreditScore")
    List<LoanApplicant> findByCreditScoreGreaterThanEqual(int minCreditScore);

    @Query("SELECT l FROM LoanApplicant l WHERE l.income >= :minIncome")
    List<LoanApplicant> findByIncomeGreaterThanEqual(double minIncome);

    @Query("SELECT l FROM LoanApplicant l WHERE l.creditScore >= :minCreditScore AND l.income >= :minIncome")
    List<LoanApplicant> findByCreditScoreAndIncomeGreaterThanEqual(int minCreditScore, double minIncome);

    @Query("SELECT l FROM LoanApplicant l WHERE l.creditScore >= :minCreditScore AND l.income >= :minIncome AND l.age >= :minAge")
    List<LoanApplicant> findByCreditScoreAndIncomeAndAgeGreaterThanEqual(int minCreditScore, double minIncome, int minAge);

    // Add more custom queries as per your requirements

}
