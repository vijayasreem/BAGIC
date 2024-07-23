
package com.BAGICLoan.repository;

import com.BAGICLoan.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

    @Query("SELECT d FROM Document d WHERE d.applicantId = ?1")
    List<Document> findByApplicantId(Long applicantId);

    @Query("SELECT d FROM Document d WHERE d.status = 'VERIFIED'")
    List<Document> findVerifiedDocuments();

    @Query("SELECT d FROM Document d WHERE d.status = 'FLAGGED'")
    List<Document> findFlaggedDocuments();

    @Query("SELECT d FROM Document d WHERE d.status = 'PENDING'")
    List<Document> findPendingDocuments();

    @Query("SELECT d FROM Document d WHERE d.status = 'VERIFIED' AND d.applicantId = ?1")
    List<Document> findVerifiedDocumentsByApplicantId(Long applicantId);

    @Query("SELECT d FROM Document d WHERE d.status = 'FLAGGED' AND d.applicantId = ?1")
    List<Document> findFlaggedDocumentsByApplicantId(Long applicantId);

    @Query("SELECT d FROM Document d WHERE d.status = 'PENDING' AND d.applicantId = ?1")
    List<Document> findPendingDocumentsByApplicantId(Long applicantId);
}
