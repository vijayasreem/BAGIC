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

    public List<Document> findByApplicantId(Long applicantId) {
        return documentRepository.findByApplicantId(applicantId);
    }

    public List<Document> findVerifiedDocuments() {
        return documentRepository.findVerifiedDocuments();
    }

    public List<Document> findFlaggedDocuments() {
        return documentRepository.findFlaggedDocuments();
    }

    public List<Document> findPendingDocuments() {
        return documentRepository.findPendingDocuments();
    }

    public List<Document> findVerifiedDocumentsByApplicantId(Long applicantId) {
        return documentRepository.findVerifiedDocumentsByApplicantId(applicantId);
    }

    public List<Document> findFlaggedDocumentsByApplicantId(Long applicantId) {
        return documentRepository.findFlaggedDocumentsByApplicantId(applicantId);
    }

    public List<Document> findPendingDocumentsByApplicantId(Long applicantId) {
        return documentRepository.findPendingDocumentsByApplicantId(applicantId);
    }
}