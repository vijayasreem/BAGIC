package com.BAGICLoan.controller;

import com.BAGICLoan.model.LoanApplication;
import com.BAGICLoan.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/channel/{channel}")
    public List<LoanApplication> findByChannel(@PathVariable String channel) {
        return loanApplicationService.findByChannel(channel);
    }

    @GetMapping("/status/{status}")
    public List<LoanApplication> findByStatus(@PathVariable String status) {
        return loanApplicationService.findByStatus(status);
    }

    @GetMapping("/customer/{customerId}")
    public List<LoanApplication> findByCustomerId(@PathVariable Long customerId) {
        return loanApplicationService.findByCustomerId(customerId);
    }

    @GetMapping("/loan-amount-range")
    public List<LoanApplication> findByLoanAmountRange(@RequestParam("minAmount") Double minAmount, @RequestParam("maxAmount") Double maxAmount) {
        return loanApplicationService.findByLoanAmountRange(minAmount, maxAmount);
    }

    @GetMapping("/approval-status/{approvalStatus}")
    public List<LoanApplication> findByApprovalStatus(@PathVariable String approvalStatus) {
        return loanApplicationService.findByApprovalStatus(approvalStatus);
    }

    @GetMapping("/disbursement-status/{disbursementStatus}")
    public List<LoanApplication> findByDisbursementStatus(@PathVariable String disbursementStatus) {
        return loanApplicationService.findByDisbursementStatus(disbursementStatus);
    }

    @GetMapping("/customer/{customerId}/status/{status}")
    public List<LoanApplication> findByCustomerIdAndStatus(@PathVariable Long customerId, @PathVariable String status) {
        return loanApplicationService.findByCustomerIdAndStatus(customerId, status);
    }

    @GetMapping("/customer/{customerId}/approval-status/{approvalStatus}")
    public List<LoanApplication> findByCustomerIdAndApprovalStatus(@PathVariable Long customerId, @PathVariable String approvalStatus) {
        return loanApplicationService.findByCustomerIdAndApprovalStatus(customerId, approvalStatus);
    }

    @GetMapping("/customer/{customerId}/disbursement-status/{disbursementStatus}")
    public List<LoanApplication> findByCustomerIdAndDisbursementStatus(@PathVariable Long customerId, @PathVariable String disbursementStatus) {
        return loanApplicationService.findByCustomerIdAndDisbursementStatus(customerId, disbursementStatus);
    }

    @GetMapping("/customer/{customerId}/loan-amount-range")
    public List<LoanApplication> findByCustomerIdAndLoanAmountRange(@PathVariable Long customerId, @RequestParam("minAmount") Double minAmount, @RequestParam("maxAmount") Double maxAmount) {
        return loanApplicationService.findByCustomerIdAndLoanAmountRange(customerId, minAmount, maxAmount);
    }

    @GetMapping("/customer/{customerId}/channel/{channel}")
    public List<LoanApplication> findByCustomerIdAndChannel(@PathVariable Long customerId, @PathVariable String channel) {
        return loanApplicationService.findByCustomerIdAndChannel(customerId, channel);
    }

    @GetMapping("/customer/{customerId}/status/{status}/approval-status/{approvalStatus}")
    public List<LoanApplication> findByCustomerIdAndStatusAndApprovalStatus(@PathVariable Long customerId, @PathVariable String status, @PathVariable String approvalStatus) {
        return loanApplicationService.findByCustomerIdAndStatusAndApprovalStatus(customerId, status, approvalStatus);
    }

    @GetMapping("/customer/{customerId}/status/{status}/disbursement-status/{disbursementStatus}")
    public List<LoanApplication> findByCustomerIdAndStatusAndDisbursementStatus(@PathVariable Long customerId, @PathVariable String status, @PathVariable String disbursementStatus) {
        return loanApplicationService.findByCustomerIdAndStatusAndDisbursementStatus(customerId, status, disbursementStatus);
    }

    @GetMapping("/customer/{customerId}/status/{status}/loan-amount-range")
    public List<LoanApplication> findByCustomerIdAndStatusAndLoanAmountRange(@PathVariable Long customerId, @PathVariable String status, @RequestParam("minAmount") Double minAmount, @RequestParam("maxAmount") Double maxAmount) {
        return loanApplicationService.findByCustomerIdAndStatusAndLoanAmountRange(customerId, status, minAmount, maxAmount);
    }

    @GetMapping("/customer/{customerId}/approval-status/{approvalStatus}/disbursement-status/{disbursementStatus}")
    public List<LoanApplication> findByCustomerIdAndApprovalStatusAndDisbursementStatus(@PathVariable Long customerId, @PathVariable String approvalStatus, @PathVariable String disbursementStatus) {
        return loanApplicationService.findByCustomerIdAndApprovalStatusAndDisbursementStatus(customerId, approvalStatus, disbursementStatus);
    }

    @GetMapping("/customer/{customerId}/approval-status/{approvalStatus}/loan-amount-range")
    public List<LoanApplication> findByCustomerIdAndApprovalStatusAndLoanAmountRange(@PathVariable Long customerId, @PathVariable String approvalStatus, @RequestParam("minAmount") Double minAmount, @RequestParam("maxAmount") Double maxAmount) {
        return loanApplicationService.findByCustomerIdAndApprovalStatusAndLoanAmountRange(customerId, approvalStatus, minAmount, maxAmount);
    }

    @GetMapping("/customer/{customerId}/disbursement-status/{disbursementStatus}/loan-amount-range")
    public List<LoanApplication> findByCustomerIdAndDisbursementStatusAndLoanAmountRange(@PathVariable Long customerId, @PathVariable String disbursementStatus, @RequestParam("minAmount") Double minAmount, @RequestParam("maxAmount") Double maxAmount) {
        return loanApplicationService.findByCustomerIdAndDisbursementStatusAndLoanAmountRange(customerId, disbursementStatus, minAmount, maxAmount);
    }

    @GetMapping("/customer/{customerId}/status/{status}/approval-status/{approvalStatus}/disbursement-status/{disbursementStatus}")
    public List<LoanApplication> findByCustomerIdAndStatusAndApprovalStatusAndDisbursementStatus(@PathVariable Long customerId, @PathVariable String status, @PathVariable String approvalStatus, @PathVariable String disbursementStatus) {
        return loanApplicationService.findByCustomerIdAndStatusAndApprovalStatusAndDisbursementStatus(customerId, status, approvalStatus, disbursementStatus);
    }

    @GetMapping("/customer/{customerId}/status/{status}/approval-status/{approvalStatus}/loan-amount-range")
    public List<LoanApplication> findByCustomerIdAndStatusAndApprovalStatusAndLoanAmountRange(@PathVariable Long customerId, @PathVariable String status, @PathVariable String approvalStatus, @RequestParam("minAmount") Double minAmount, @RequestParam("maxAmount") Double maxAmount) {
        return loanApplicationService.findByCustomerIdAndStatusAndApprovalStatusAndLoanAmountRange(customerId, status, approvalStatus, minAmount, maxAmount);
    }

    @GetMapping("/customer/{customerId}/status/{status}/disbursement-status/{disbursementStatus}/loan-amount-range")
    public List<LoanApplication> findByCustomerIdAndStatusAndDisbursementStatusAndLoanAmountRange(@PathVariable Long customerId, @PathVariable String status, @PathVariable String disbursementStatus, @RequestParam("minAmount") Double minAmount, @RequestParam("maxAmount") Double maxAmount) {
        return loanApplicationService.findByCustomerIdAndStatusAndDisbursementStatusAndLoanAmountRange(customerId, status, disbursementStatus, minAmount, maxAmount);
    }

    @GetMapping("/customer/{customerId}/approval-status/{approvalStatus}/disbursement-status/{disbursementStatus}/loan-amount-range")
    public List<LoanApplication> findByCustomerIdAndApprovalStatusAndDisbursementStatusAndLoanAmountRange(@PathVariable Long customerId, @PathVariable String approvalStatus, @PathVariable String disbursementStatus, @RequestParam("minAmount") Double minAmount, @RequestParam("maxAmount") Double maxAmount) {
        return loanApplicationService.findByCustomerIdAndApprovalStatusAndDisbursementStatusAndLoanAmountRange(customerId, approvalStatus, disbursementStatus, minAmount, maxAmount);
    }

    @GetMapping("/status/{status}/approval-status/{approvalStatus}/disbursement-status/{disbursementStatus}/loan-amount-range")
    public List<LoanApplication> findByStatusAndApprovalStatusAndDisbursementStatusAndLoanAmountRange(@PathVariable String status, @PathVariable String approvalStatus, @PathVariable String disbursementStatus, @RequestParam("minAmount") Double minAmount, @RequestParam("maxAmount") Double maxAmount) {
        return loanApplicationService.findByStatusAndApprovalStatusAndDisbursementStatusAndLoanAmountRange(status, approvalStatus, disbursementStatus, minAmount, maxAmount);
    }

    @GetMapping("/customer/{customerId}/status/{status}/approval-status/{approvalStatus}/disbursement-status/{disbursementStatus}/loan-amount-range")
    public List<LoanApplication> findByCustomerIdAndStatusAndApprovalStatusAndDisbursementStatusAndLoanAmountRange(@PathVariable Long customerId, @PathVariable String status, @PathVariable String approvalStatus, @PathVariable String disbursementStatus, @RequestParam("minAmount") Double minAmount, @RequestParam("maxAmount") Double maxAmount) {
        return loanApplicationService.findByCustomerIdAndStatusAndApprovalStatusAndDisbursementStatusAndLoanAmountRange(customerId, status, approvalStatus, disbursementStatus, minAmount, maxAmount);
    }
}