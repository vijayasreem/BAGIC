
package com.BAGICLoan.repository;

import com.BAGICLoan.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    @Query("SELECT la FROM LoanApplication la WHERE la.channel = 'in-person'")
    List<LoanApplication> findByInPersonChannel();

    @Query("SELECT la FROM LoanApplication la WHERE la.channel = 'website'")
    List<LoanApplication> findByWebsiteChannel();

    @Query("SELECT la FROM LoanApplication la WHERE la.channel = 'mobile app'")
    List<LoanApplication> findByMobileAppChannel();

    // Add more custom queries as needed

}
