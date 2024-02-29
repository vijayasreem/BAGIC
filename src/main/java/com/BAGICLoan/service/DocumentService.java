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

    public Document saveDocument(Document document) {
        return documentRepository.save(document);
    }

    public Document findDocumentById(Long id) {
        return documentRepository.findById(id).orElse(null);
    }

    public Document findDocumentByDocumentName(String documentName) {
        return documentRepository.findByDocumentName(documentName);
    }

    public List<Document> findDocumentsByCreatedBy(String createdBy) {
        return documentRepository.findByCreatedBy(createdBy);
    }
}
