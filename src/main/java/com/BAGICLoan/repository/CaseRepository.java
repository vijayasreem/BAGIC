
package com.BAGICLoan.repository;

import com.BAGICLoan.model.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseRepository extends JpaRepository<Case, Long> {

    @Query("SELECT c FROM Case c WHERE c.caseNumber = :caseNumber AND c.caseYear = :caseYear")
    Case findByCaseNumberAndCaseYear(String caseNumber, int caseYear);

    @Query("SELECT c FROM Case c WHERE c.courtLocation = :courtLocation")
    List<Case> findByCourtLocation(String courtLocation);

    @Query("SELECT c FROM Case c WHERE c.status = :status")
    List<Case> findByStatus(String status);

    // Add more custom queries as needed

}
