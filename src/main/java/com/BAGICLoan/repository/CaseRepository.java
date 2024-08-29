
package com.BAGICLoan.repository;

import com.BAGICLoan.model.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseRepository extends JpaRepository<Case, Long> {

    @Query("SELECT c FROM Case c WHERE c.caseNumber = ?1 AND c.caseYear = ?2")
    Case findByCaseNumberAndYear(String caseNumber, int caseYear);

    @Query("SELECT c FROM Case c WHERE c.courtLocation = ?1")
    List<Case> findByCourtLocation(String courtLocation);

    @Query("SELECT c FROM Case c WHERE c.status = ?1")
    List<Case> findByStatus(String status);

    // Add more custom queries as needed

}
