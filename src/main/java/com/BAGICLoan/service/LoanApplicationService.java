package com.BAGICLoan.service;

import com.BAGICLoan.model.LoanApplication;
import com.BAGICLoan.repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanApplicationService {

    private final LoanApplicationRepository loanApplicationRepository;

    @Autowired
    public LoanApplicationService(LoanApplicationRepository loanApplicationRepository) {
        this.loanApplicationRepository = loanApplicationRepository;
    }

    public List<LoanApplication> findByChannel(String channel) {
        return loanApplicationRepository.findByChannel(channel);
    }

    public List<LoanApplication> findByStatus(String status) {
        return loanApplicationRepository.findByStatus(status);
    }

    public List<LoanApplication> findByCustomerId(Long customerId) {
        return loanApplicationRepository.findByCustomerId(customerId);
    }

    public List<LoanApplication> findByLoanAmountRange(Double minAmount, Double maxAmount) {
        return loanApplicationRepository.findByLoanAmountRange(minAmount, maxAmount);
    }

    public List<LoanApplication> findByApprovalStatus(String approvalStatus) {
        return loanApplicationRepository.findByApprovalStatus(approvalStatus);
    }

    public List<LoanApplication> findByDisbursementStatus(String disbursementStatus) {
        return loanApplicationRepository.findByDisbursementStatus(disbursementStatus);
    }

    public List<LoanApplication> findByCustomerIdAndStatus(Long customerId, String status) {
        return loanApplicationRepository.findByCustomerIdAndStatus(customerId, status);
    }

    public List<LoanApplication> findByCustomerIdAndApprovalStatus(Long customerId, String approvalStatus) {
        return loanApplicationRepository.findByCustomerIdAndApprovalStatus(customerId, approvalStatus);
    }

    public List<LoanApplication> findByCustomerIdAndDisbursementStatus(Long customerId, String disbursementStatus) {
        return loanApplicationRepository.findByCustomerIdAndDisbursementStatus(customerId, disbursementStatus);
    }

    public List<LoanApplication> findByCustomerIdAndLoanAmountRange(Long customerId, Double minAmount, Double maxAmount) {
        return loanApplicationRepository.findByCustomerIdAndLoanAmountRange(customerId, minAmount, maxAmount);
    }

    public List<LoanApplication> findByCustomerIdAndChannel(Long customerId, String channel) {
        return loanApplicationRepository.findByCustomerIdAndChannel(customerId, channel);
    }

    public List<LoanApplication> findByCustomerIdAndStatusAndApprovalStatus(Long customerId, String status, String approvalStatus) {
        return loanApplicationRepository.findByCustomerIdAndStatusAndApprovalStatus(customerId, status, approvalStatus);
    }

    public List<LoanApplication> findByCustomerIdAndStatusAndDisbursementStatus(Long customerId, String status, String disbursementStatus) {
        return loanApplicationRepository.findByCustomerIdAndStatusAndDisbursementStatus(customerId, status, disbursementStatus);
    }

    public List<LoanApplication> findByCustomerIdAndStatusAndLoanAmountRange(Long customerId, String status, Double minAmount, Double maxAmount) {
        return loanApplicationRepository.findByCustomerIdAndStatusAndLoanAmountRange(customerId, status, minAmount, maxAmount);
    }

    public List<LoanApplication> findByCustomerIdAndApprovalStatusAndDisbursementStatus(Long customerId, String approvalStatus, String disbursementStatus) {
        return loanApplicationRepository.findByCustomerIdAndApprovalStatusAndDisbursementStatus(customerId, approvalStatus, disbursementStatus);
    }

    public List<LoanApplication> findByCustomerIdAndApprovalStatusAndLoanAmountRange(Long customerId, String approvalStatus, Double minAmount, Double maxAmount) {
        return loanApplicationRepository.findByCustomerIdAndApprovalStatusAndLoanAmountRange(customerId, approvalStatus, minAmount, maxAmount);
    }

    public List<LoanApplication> findByCustomerIdAndDisbursementStatusAndLoanAmountRange(Long customerId, String disbursementStatus, Double minAmount, Double maxAmount) {
        return loanApplicationRepository.findByCustomerIdAndDisbursementStatusAndLoanAmountRange(customerId, disbursementStatus, minAmount, maxAmount);
    }

    public List<LoanApplication> findByCustomerIdAndStatusAndApprovalStatusAndDisbursementStatus(Long customerId, String status, String approvalStatus, String disbursementStatus) {
        return loanApplicationRepository.findByCustomerIdAndStatusAndApprovalStatusAndDisbursementStatus(customerId, status, approvalStatus, disbursementStatus);
    }

    public List<LoanApplication> findByCustomerIdAndStatusAndApprovalStatusAndLoanAmountRange(Long customerId, String status, String approvalStatus, Double minAmount, Double maxAmount) {
        return loanApplicationRepository.findByCustomerIdAndStatusAndApprovalStatusAndLoanAmountRange(customerId, status, approvalStatus, minAmount, maxAmount);
    }

    public List<LoanApplication> findByCustomerIdAndStatusAndDisbursementStatusAndLoanAmountRange(Long customerId, String status, String disbursementStatus, Double minAmount, Double maxAmount) {
        return loanApplicationRepository.findByCustomerIdAndStatusAndDisbursementStatusAndLoanAmountRange(customerId, status, disbursementStatus, minAmount, maxAmount);
    }

    public List<LoanApplication> findByCustomerIdAndApprovalStatusAndDisbursementStatusAndLoanAmountRange(Long customerId, String approvalStatus, String disbursementStatus, Double minAmount, Double maxAmount) {
        return loanApplicationRepository.findByCustomerIdAndApprovalStatusAndDisbursementStatusAndLoanAmountRange(customerId, approvalStatus, disbursementStatus, minAmount, maxAmount);
    }

    public List<LoanApplication> findByStatusAndApprovalStatusAndDisbursementStatusAndLoanAmountRange(String status, String approvalStatus, String disbursementStatus, Double minAmount, Double maxAmount) {
        return loanApplicationRepository.findByStatusAndApprovalStatusAndDisbursementStatusAndLoanAmountRange(status, approvalStatus, disbursementStatus, minAmount, maxAmount);
    }

    public List<LoanApplication> findByCustomerIdAndStatusAndApprovalStatusAndDisbursementStatusAndLoanAmountRange(Long customerId, String status, String approvalStatus, String disbursementStatus, Double minAmount, Double maxAmount) {
        return loanApplicationRepository.findByCustomerIdAndStatusAndApprovalStatusAndDisbursementStatusAndLoanAmountRange(customerId, status, approvalStatus, disbursementStatus, minAmount, maxAmount);
    }
}