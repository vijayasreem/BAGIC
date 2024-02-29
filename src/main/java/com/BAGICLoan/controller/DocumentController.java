package com.BAGICLoan.controller;

import com.BAGICLoan.model.Document;
import com.BAGICLoan.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/documents")
public class DocumentController {

    private final DocumentService documentService;

    @Autowired
    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping
    public ResponseEntity<Document> saveDocument(@RequestBody Document document) {
        Document savedDocument = documentService.saveDocument(document);
        return new ResponseEntity<>(savedDocument, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Document> findDocumentById(@PathVariable("id") Long id) {
        Document document = documentService.findDocumentById(id);
        if (document == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(document, HttpStatus.OK);
    }

    @GetMapping("/name/{documentName}")
    public ResponseEntity<Document> findDocumentByDocumentName(@PathVariable("documentName") String documentName) {
        Document document = documentService.findDocumentByDocumentName(documentName);
        if (document == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(document, HttpStatus.OK);
    }

    @GetMapping("/createdBy/{createdBy}")
    public ResponseEntity<List<Document>> findDocumentsByCreatedBy(@PathVariable("createdBy") String createdBy) {
        List<Document> documents = documentService.findDocumentsByCreatedBy(createdBy);
        if (documents.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(documents, HttpStatus.OK);
    }
}