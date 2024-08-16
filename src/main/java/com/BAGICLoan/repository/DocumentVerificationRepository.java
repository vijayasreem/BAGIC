
package com.BAGICLoan.repository;

import com.BAGICLoan.model.DocumentVerification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentVerificationRepository extends JpaRepository<DocumentVerification, Long> {

    @Query("SELECT CASE WHEN COUNT(d) > 0 THEN true ELSE false END FROM DocumentVerification d WHERE d.identityVerified = true AND d.addressVerified = true")
    boolean isDocumentVerified();

    @Query("SELECT CASE WHEN COUNT(d) > 0 THEN true ELSE false END FROM DocumentVerification d WHERE d.identityVerified = false OR d.addressVerified = false")
    boolean isIncompleteDocumentVerification();

    @Query("SELECT CASE WHEN COUNT(d) > 0 THEN true ELSE false END FROM DocumentVerification d WHERE d.annualIncome >= 30000 AND d.creditScore >= 700")
    boolean isHighLimitEligible();

    @Query("SELECT CASE WHEN COUNT(d) > 0 THEN true ELSE false END FROM DocumentVerification d WHERE d.annualIncome >= 20000 AND d.creditScore >= 600")
    boolean isModerateLimitEligible();

    DocumentVerification save(DocumentVerification documentVerification);
}
