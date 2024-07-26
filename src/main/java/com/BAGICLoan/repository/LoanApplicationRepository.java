
package com.BAGICLoan.repository;

import com.BAGICLoan.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    // Query to get loan applications by channel
    @Query("SELECT la FROM LoanApplication la WHERE la.channel = ?1")
    List<LoanApplication> findByChannel(String channel);

    // Query to get loan applications by status
    @Query("SELECT la FROM LoanApplication la WHERE la.status = ?1")
    List<LoanApplication> findByStatus(String status);

    // Query to get loan applications by customer ID
    @Query("SELECT la FROM LoanApplication la WHERE la.customerId = ?1")
    List<LoanApplication> findByCustomerId(Long customerId);

    // Query to get loan applications by loan amount range
    @Query("SELECT la FROM LoanApplication la WHERE la.loanAmount >= ?1 AND la.loanAmount <= ?2")
    List<LoanApplication> findByLoanAmountRange(Double minAmount, Double maxAmount);

    // Query to get loan applications by approval status
    @Query("SELECT la FROM LoanApplication la WHERE la.approvalStatus = ?1")
    List<LoanApplication> findByApprovalStatus(String approvalStatus);

    // Query to get loan applications by disbursement status
    @Query("SELECT la FROM LoanApplication la WHERE la.disbursementStatus = ?1")
    List<LoanApplication> findByDisbursementStatus(String disbursementStatus);

    // Query to get loan applications by customer ID and status
    @Query("SELECT la FROM LoanApplication la WHERE la.customerId = ?1 AND la.status = ?2")
    List<LoanApplication> findByCustomerIdAndStatus(Long customerId, String status);

    // Query to get loan applications by customer ID and approval status
    @Query("SELECT la FROM LoanApplication la WHERE la.customerId = ?1 AND la.approvalStatus = ?2")
    List<LoanApplication> findByCustomerIdAndApprovalStatus(Long customerId, String approvalStatus);

    // Query to get loan applications by customer ID and disbursement status
    @Query("SELECT la FROM LoanApplication la WHERE la.customerId = ?1 AND la.disbursementStatus = ?2")
    List<LoanApplication> findByCustomerIdAndDisbursementStatus(Long customerId, String disbursementStatus);

    // Query to get loan applications by customer ID and loan amount range
    @Query("SELECT la FROM LoanApplication la WHERE la.customerId = ?1 AND la.loanAmount >= ?2 AND la.loanAmount <= ?3")
    List<LoanApplication> findByCustomerIdAndLoanAmountRange(Long customerId, Double minAmount, Double maxAmount);

    // Query to get loan applications by customer ID and channel
    @Query("SELECT la FROM LoanApplication la WHERE la.customerId = ?1 AND la.channel = ?2")
    List<LoanApplication> findByCustomerIdAndChannel(Long customerId, String channel);

    // Query to get loan applications by customer ID, status, and approval status
    @Query("SELECT la FROM LoanApplication la WHERE la.customerId = ?1 AND la.status = ?2 AND la.approvalStatus = ?3")
    List<LoanApplication> findByCustomerIdAndStatusAndApprovalStatus(Long customerId, String status, String approvalStatus);

    // Query to get loan applications by customer ID, status, and disbursement status
    @Query("SELECT la FROM LoanApplication la WHERE la.customerId = ?1 AND la.status = ?2 AND la.disbursementStatus = ?3")
    List<LoanApplication> findByCustomerIdAndStatusAndDisbursementStatus(Long customerId, String status, String disbursementStatus);

    // Query to get loan applications by customer ID, status, and loan amount range
    @Query("SELECT la FROM LoanApplication la WHERE la.customerId = ?1 AND la.status = ?2 AND la.loanAmount >= ?3 AND la.loanAmount <= ?4")
    List<LoanApplication> findByCustomerIdAndStatusAndLoanAmountRange(Long customerId, String status, Double minAmount, Double maxAmount);

    // Query to get loan applications by customer ID, approval status, and disbursement status
    @Query("SELECT la FROM LoanApplication la WHERE la.customerId = ?1 AND la.approvalStatus = ?2 AND la.disbursementStatus = ?3")
    List<LoanApplication> findByCustomerIdAndApprovalStatusAndDisbursementStatus(Long customerId, String approvalStatus, String disbursementStatus);

    // Query to get loan applications by customer ID, approval status, and loan amount range
    @Query("SELECT la FROM LoanApplication la WHERE la.customerId = ?1 AND la.approvalStatus = ?2 AND la.loanAmount >= ?3 AND la.loanAmount <= ?4")
    List<LoanApplication> findByCustomerIdAndApprovalStatusAndLoanAmountRange(Long customerId, String approvalStatus, Double minAmount, Double maxAmount);

    // Query to get loan applications by customer ID, disbursement status, and loan amount range
    @Query("SELECT la FROM LoanApplication la WHERE la.customerId = ?1 AND la.disbursementStatus = ?2 AND la.loanAmount >= ?3 AND la.loanAmount <= ?4")
    List<LoanApplication> findByCustomerIdAndDisbursementStatusAndLoanAmountRange(Long customerId, String disbursementStatus, Double minAmount, Double maxAmount);

    // Query to get loan applications by customer ID, status, approval status, and disbursement status
    @Query("SELECT la FROM LoanApplication la WHERE la.customerId = ?1 AND la.status = ?2 AND la.approvalStatus = ?3 AND la.disbursementStatus = ?4")
    List<LoanApplication> findByCustomerIdAndStatusAndApprovalStatusAndDisbursementStatus(Long customerId, String status, String approvalStatus, String disbursementStatus);

    // Query to get loan applications by customer ID, status, approval status, and loan amount range
    @Query("SELECT la FROM LoanApplication la WHERE la.customerId = ?1 AND la.status = ?2 AND la.approvalStatus = ?3 AND la.loanAmount >= ?4 AND la.loanAmount <= ?5")
    List<LoanApplication> findByCustomerIdAndStatusAndApprovalStatusAndLoanAmountRange(Long customerId, String status, String approvalStatus, Double minAmount, Double maxAmount);

    // Query to get loan applications by customer ID, status, disbursement status, and loan amount range
    @Query("SELECT la FROM LoanApplication la WHERE la.customerId = ?1 AND la.status = ?2 AND la.disbursementStatus = ?3 AND la.loanAmount >= ?4 AND la.loanAmount <= ?5")
    List<LoanApplication> findByCustomerIdAndStatusAndDisbursementStatusAndLoanAmountRange(Long customerId, String status, String disbursementStatus, Double minAmount, Double maxAmount);

    // Query to get loan applications by customer ID, approval status, disbursement status, and loan amount range
    @Query("SELECT la FROM LoanApplication la WHERE la.customerId = ?1 AND la.approvalStatus = ?2 AND la.disbursementStatus = ?3 AND la.loanAmount >= ?4 AND la.loanAmount <= ?5")
    List<LoanApplication> findByCustomerIdAndApprovalStatusAndDisbursementStatusAndLoanAmountRange(Long customerId, String approvalStatus, String disbursementStatus, Double minAmount, Double maxAmount);

    // Query to get loan applications by status, approval status, disbursement status, and loan amount range
    @Query("SELECT la FROM LoanApplication la WHERE la.status = ?1 AND la.approvalStatus = ?2 AND la.disbursementStatus = ?3 AND la.loanAmount >= ?4 AND la.loanAmount <= ?5")
    List<LoanApplication> findByStatusAndApprovalStatusAndDisbursementStatusAndLoanAmountRange(String status, String approvalStatus, String disbursementStatus, Double minAmount, Double maxAmount);

    // Query to get loan applications by customer ID, status, approval status, disbursement status, and loan amount range
    @Query("SELECT la FROM LoanApplication la WHERE la.customerId = ?1 AND la.status = ?2 AND la.approvalStatus = ?3 AND la.disbursementStatus = ?4 AND la.loanAmount >= ?5 AND la.loanAmount <= ?6")
    List<LoanApplication> findByCustomerIdAndStatusAndApprovalStatusAndDisbursementStatusAndLoanAmountRange(Long customerId, String status, String approvalStatus, String disbursementStatus, Double minAmount, Double maxAmount);
}
