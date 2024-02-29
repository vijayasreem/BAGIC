
package com.BAGICLoan.repository;

import com.BAGICLoan.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

    @Query(value = "SELECT * FROM document WHERE document_name = ?1", nativeQuery = true)
    Document findByDocumentName(String documentName);

    @Query(value = "SELECT * FROM document WHERE created_by = ?1", nativeQuery = true)
    List<Document> findByCreatedBy(String createdBy);

}
