
package com.BAGICLoan.repository;

import com.BAGICLoan.model.DocumentVerification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentVerificationRepository extends JpaRepository<DocumentVerification, Long> {

    @Query("SELECT CASE WHEN COUNT(dv) > 0 THEN true ELSE false END FROM DocumentVerification dv WHERE dv.identityVerified = true AND dv.addressVerified = true")
    boolean isDocumentVerified();

    @Query("SELECT CASE WHEN COUNT(dv) > 0 THEN true ELSE false END FROM DocumentVerification dv WHERE dv.identityVerified = false OR dv.addressVerified = false")
    boolean isIncompleteDocumentVerification();

    @Query("SELECT CASE WHEN COUNT(dv) > 0 THEN true ELSE false END FROM DocumentVerification dv WHERE dv.annualIncome >= 30000 AND dv.creditScore >= 700")
    boolean isHighLimitCreditScore();

    @Query("SELECT CASE WHEN COUNT(dv) > 0 THEN true ELSE false END FROM DocumentVerification dv WHERE dv.annualIncome >= 20000 AND dv.creditScore >= 600")
    boolean isModerateLimitCreditScore();
}
