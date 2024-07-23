package com.BAGICLoan.controller;

import com.BAGICLoan.model.Document;
import com.BAGICLoan.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class DocumentController {

    private final DocumentService documentService;

    @Autowired
    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/applicant/{applicantId}")
    public List<Document> getDocumentsByApplicantId(@PathVariable Long applicantId) {
        return documentService.findByApplicantId(applicantId);
    }

    @GetMapping("/verified")
    public List<Document> getVerifiedDocuments() {
        return documentService.findVerifiedDocuments();
    }

    @GetMapping("/flagged")
    public List<Document> getFlaggedDocuments() {
        return documentService.findFlaggedDocuments();
    }

    @GetMapping("/pending")
    public List<Document> getPendingDocuments() {
        return documentService.findPendingDocuments();
    }

    @GetMapping("/applicant/{applicantId}/verified")
    public List<Document> getVerifiedDocumentsByApplicantId(@PathVariable Long applicantId) {
        return documentService.findVerifiedDocumentsByApplicantId(applicantId);
    }

    @GetMapping("/applicant/{applicantId}/flagged")
    public List<Document> getFlaggedDocumentsByApplicantId(@PathVariable Long applicantId) {
        return documentService.findFlaggedDocumentsByApplicantId(applicantId);
    }

    @GetMapping("/applicant/{applicantId}/pending")
    public List<Document> getPendingDocumentsByApplicantId(@PathVariable Long applicantId) {
        return documentService.findPendingDocumentsByApplicantId(applicantId);
    }

    @PostMapping
    public Document uploadDocument(@RequestBody Document document) {
        // Implement document upload logic here
        return documentService.uploadDocument(document);
    }

    @PutMapping("/{documentId}")
    public Document updateDocument(@PathVariable Long documentId, @RequestBody Document document) {
        // Implement document update logic here
        return documentService.updateDocument(documentId, document);
    }

    @DeleteMapping("/{documentId}")
    public void deleteDocument(@PathVariable Long documentId) {
        // Implement document deletion logic here
        documentService.deleteDocument(documentId);
    }
}