package com.BAGICLoan.controller;

import com.BAGICLoan.model.LoanApplication;
import com.BAGICLoan.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loan-applications")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @PostMapping("/validate/required-fields")
    public boolean validateRequiredFields(@RequestParam String field1, @RequestParam String field2, @RequestParam String field3) {
        return loanApplicationService.validateRequiredFields(field1, field2, field3);
    }

    @PostMapping("/validate/email-format")
    public boolean validateEmailFormat(@RequestParam String email) {
        return loanApplicationService.validateEmailFormat(email);
    }

    @PostMapping("/validate/phone-number-format")
    public boolean validatePhoneNumberFormat(@RequestParam String phoneNumber) {
        return loanApplicationService.validatePhoneNumberFormat(phoneNumber);
    }

    @PostMapping("/validate/document-type-and-size")
    public boolean validateDocumentTypeAndSize(@RequestParam String documentType, @RequestParam long documentSize) {
        return loanApplicationService.validateDocumentTypeAndSize(documentType, documentSize);
    }

    @GetMapping("/status/{status}")
    public List<LoanApplication> getLoanApplicationsByStatus(@PathVariable String status) {
        return loanApplicationService.getLoanApplicationsByStatus(status);
    }

    @GetMapping("/user/{userId}")
    public List<LoanApplication> getLoanApplicationsByUserId(@PathVariable Long userId) {
        return loanApplicationService.getLoanApplicationsByUserId(userId);
    }

    @GetMapping("/document-type/{documentType}")
    public List<LoanApplication> getLoanApplicationsByDocumentType(@PathVariable String documentType) {
        return loanApplicationService.getLoanApplicationsByDocumentType(documentType);
    }

    @GetMapping("/document-type/{documentType}/status/{status}")
    public List<LoanApplication> getLoanApplicationsByDocumentTypeAndStatus(@PathVariable String documentType, @PathVariable String status) {
        return loanApplicationService.getLoanApplicationsByDocumentTypeAndStatus(documentType, status);
    }

    @GetMapping("/document-type/{documentType}/user/{userId}")
    public List<LoanApplication> getLoanApplicationsByDocumentTypeAndUserId(@PathVariable String documentType, @PathVariable Long userId) {
        return loanApplicationService.getLoanApplicationsByDocumentTypeAndUserId(documentType, userId);
    }

    @GetMapping("/document-type/{documentType}/status/{status}/user/{userId}")
    public List<LoanApplication> getLoanApplicationsByDocumentTypeAndStatusAndUserId(@PathVariable String documentType, @PathVariable String status, @PathVariable Long userId) {
        return loanApplicationService.getLoanApplicationsByDocumentTypeAndStatusAndUserId(documentType, status, userId);
    }

    @GetMapping("/document-type/{documentType}/status/{status}/user/{userId}/page")
    public Page<LoanApplication> getLoanApplicationsByDocumentTypeAndStatusAndUserIdWithPagination(@PathVariable String documentType, @PathVariable String status, @PathVariable Long userId, Pageable pageable) {
        return loanApplicationService.getLoanApplicationsByDocumentTypeAndStatusAndUserIdWithPagination(documentType, status, userId, pageable);
    }

    @GetMapping("/document-type/{documentType}/status/{status}/user/{userId}/sort")
    public List<LoanApplication> getLoanApplicationsByDocumentTypeAndStatusAndUserIdWithSorting(@PathVariable String documentType, @PathVariable String status, @PathVariable Long userId) {
        return loanApplicationService.getLoanApplicationsByDocumentTypeAndStatusAndUserIdWithSorting(documentType, status, userId);
    }

    @GetMapping("/field1/{field1}/field2/{field2}")
    public List<LoanApplication> getLoanApplicationsByField1AndField2(@PathVariable String field1, @PathVariable String field2) {
        return loanApplicationService.getLoanApplicationsByField1AndField2(field1, field2);
    }
}