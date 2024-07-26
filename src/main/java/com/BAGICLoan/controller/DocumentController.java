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

    @GetMapping("/customer/{customerId}")
    public List<Document> getDocumentsByCustomerId(@PathVariable Long customerId) {
        return documentService.findByCustomerId(customerId);
    }

    @GetMapping("/customer/{customerId}/type/{documentType}")
    public Document getDocumentByCustomerIdAndType(@PathVariable Long customerId, @PathVariable String documentType) {
        return documentService.findByCustomerIdAndDocumentType(customerId, documentType);
    }

    @GetMapping("/customer/{customerId}/status/{documentStatus}")
    public List<Document> getDocumentsByCustomerIdAndStatus(@PathVariable Long customerId, @PathVariable String documentStatus) {
        return documentService.findByCustomerIdAndDocumentStatus(customerId, documentStatus);
    }

    @GetMapping("/status/{documentStatus}")
    public List<Document> getDocumentsByStatus(@PathVariable String documentStatus) {
        return documentService.findByDocumentStatus(documentStatus);
    }

    @GetMapping("/status/{documentStatus}/type/{documentType}")
    public List<Document> getDocumentsByStatusAndType(@PathVariable String documentStatus, @PathVariable String documentType) {
        return documentService.findByDocumentStatusAndDocumentType(documentStatus, documentType);
    }
    
    // Add other required business methods and their implementations here
}