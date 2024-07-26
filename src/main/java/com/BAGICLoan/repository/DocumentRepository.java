
package com.BAGICLoan.repository;

import com.BAGICLoan.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

    @Query("SELECT d FROM Document d WHERE d.customerId = ?1")
    List<Document> findByCustomerId(Long customerId);

    @Query("SELECT d FROM Document d WHERE d.customerId = ?1 AND d.documentType = ?2")
    Document findByCustomerIdAndDocumentType(Long customerId, String documentType);

    @Query("SELECT d FROM Document d WHERE d.customerId = ?1 AND d.documentStatus = ?2")
    List<Document> findByCustomerIdAndDocumentStatus(Long customerId, String documentStatus);

    @Query("SELECT d FROM Document d WHERE d.documentStatus = ?1")
    List<Document> findByDocumentStatus(String documentStatus);

    @Query("SELECT d FROM Document d WHERE d.documentStatus = ?1 AND d.documentType = ?2")
    List<Document> findByDocumentStatusAndDocumentType(String documentStatus, String documentType);
}
