package com.BAGICLoan.service;

import com.BAGICLoan.model.LoanApplication;
import com.BAGICLoan.repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanApplicationService {

    private final LoanApplicationRepository loanApplicationRepository;

    @Autowired
    public LoanApplicationService(LoanApplicationRepository loanApplicationRepository) {
        this.loanApplicationRepository = loanApplicationRepository;
    }

    public boolean validateRequiredFields(String field1, String field2, String field3) {
        return loanApplicationRepository.existsByField1AndField2AndField3NotNull(field1, field2, field3);
    }

    public boolean validateEmailFormat(String email) {
        return loanApplicationRepository.existsByEmailRegex(email);
    }

    public boolean validatePhoneNumberFormat(String phoneNumber) {
        return loanApplicationRepository.existsByPhoneNumberRegex(phoneNumber);
    }

    public boolean validateDocumentTypeAndSize(String documentType, long documentSize) {
        return loanApplicationRepository.existsByDocumentTypeAndDocumentSize(documentType, documentSize);
    }

    public List<LoanApplication> getLoanApplicationsByStatus(String status) {
        return loanApplicationRepository.findByStatus(status);
    }

    public List<LoanApplication> getLoanApplicationsByUserId(Long userId) {
        return loanApplicationRepository.findByUserId(userId);
    }

    public List<LoanApplication> getLoanApplicationsByDocumentType(String documentType) {
        return loanApplicationRepository.findByDocumentType(documentType);
    }

    public List<LoanApplication> getLoanApplicationsByDocumentTypeAndStatus(String documentType, String status) {
        return loanApplicationRepository.findByDocumentTypeAndStatus(documentType, status);
    }

    public List<LoanApplication> getLoanApplicationsByDocumentTypeAndUserId(String documentType, Long userId) {
        return loanApplicationRepository.findByDocumentTypeAndUserId(documentType, userId);
    }

    public List<LoanApplication> getLoanApplicationsByDocumentTypeAndStatusAndUserId(String documentType, String status, Long userId) {
        return loanApplicationRepository.findByDocumentTypeAndStatusAndUserId(documentType, status, userId);
    }

    public Page<LoanApplication> getLoanApplicationsByDocumentTypeAndStatusAndUserIdWithPagination(String documentType, String status, Long userId, Pageable pageable) {
        return loanApplicationRepository.findByDocumentTypeAndStatusAndUserId(documentType, status, userId, pageable);
    }

    public List<LoanApplication> getLoanApplicationsByDocumentTypeAndStatusAndUserIdWithSorting(String documentType, String status, Long userId) {
        return loanApplicationRepository.findByDocumentTypeAndStatusAndUserIdOrderByField1Asc(documentType, status, userId);
    }

    public List<LoanApplication> getLoanApplicationsByField1AndField2(String field1, String field2) {
        return loanApplicationRepository.findByField1AndField2(field1, field2);
    }
}