
package com.BAGICLoan.repository;

import com.BAGICLoan.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    // Method for validating completeness of required fields
    boolean existsByField1AndField2AndField3NotNull(String field1, String field2, String field3);

    // Method for validating email format
    boolean existsByEmailRegex(String email);

    // Method for validating phone number format
    boolean existsByPhoneNumberRegex(String phoneNumber);

    // Method for validating correct file type and size
    boolean existsByDocumentTypeAndDocumentSize(String documentType, long documentSize);

    // Method for retrieving loan application data by status
    List<LoanApplication> findByStatus(String status);

    // Method for retrieving loan application data by user ID
    List<LoanApplication> findByUserId(Long userId);

    // Method for retrieving loan application data by document type
    List<LoanApplication> findByDocumentType(String documentType);

    // Method for retrieving loan application data by document type and status
    List<LoanApplication> findByDocumentTypeAndStatus(String documentType, String status);

    // Method for retrieving loan application data by document type and user ID
    List<LoanApplication> findByDocumentTypeAndUserId(String documentType, Long userId);

    // Method for retrieving loan application data by document type, status, and user ID
    List<LoanApplication> findByDocumentTypeAndStatusAndUserId(String documentType, String status, Long userId);

    // Method for retrieving loan application data by document type, status, and user ID with pagination
    Page<LoanApplication> findByDocumentTypeAndStatusAndUserId(String documentType, String status, Long userId, Pageable pageable);

    // Method for retrieving loan application data by document type, status, and user ID with sorting
    List<LoanApplication> findByDocumentTypeAndStatusAndUserIdOrderByField1Asc(String documentType, String status, Long userId);

    // Custom query example
    @Query("SELECT la FROM LoanApplication la WHERE la.field1 = ?1 AND la.field2 = ?2")
    List<LoanApplication> findByField1AndField2(String field1, String field2);
}
