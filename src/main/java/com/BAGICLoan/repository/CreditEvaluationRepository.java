
package com.BAGICLoan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditEvaluationRepository extends JpaRepository<CreditEvaluation, Long> {

    CreditEvaluation findByAnnualIncomeAndCreditScore(Double annualIncome, Integer creditScore);

}
