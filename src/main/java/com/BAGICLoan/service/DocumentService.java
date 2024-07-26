
package com.BAGICLoan.service;

import com.BAGICLoan.model.Document;
import com.BAGICLoan.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

    private final DocumentRepository documentRepository;

    @Autowired
    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public List<Document> findByCustomerId(Long customerId) {
        return documentRepository.findByCustomerId(customerId);
    }

    public Document findByCustomerIdAndDocumentType(Long customerId, String documentType) {
        return documentRepository.findByCustomerIdAndDocumentType(customerId, documentType);
    }

    public List<Document> findByCustomerIdAndDocumentStatus(Long customerId, String documentStatus) {
        return documentRepository.findByCustomerIdAndDocumentStatus(customerId, documentStatus);
    }

    public List<Document> findByDocumentStatus(String documentStatus) {
        return documentRepository.findByDocumentStatus(documentStatus);
    }

    public List<Document> findByDocumentStatusAndDocumentType(String documentStatus, String documentType) {
        return documentRepository.findByDocumentStatusAndDocumentType(documentStatus, documentType);
    }
}
