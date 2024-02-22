package com.BAGICLoan.controller;

import com.BAGICLoan.model.LoanApplication;
import com.BAGICLoan.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/loanApplications")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/byApplicationType/{applicationType}")
    public List<LoanApplication> getLoanApplicationsByApplicationType(@PathVariable String applicationType) {
        List<LoanApplication> loanApplications = loanApplicationService.getLoanApplicationsByApplicationType(applicationType);
        
        if (loanApplications.isEmpty()) {
            // Return an empty list with a message indicating no applications were found
            System.out.println("No loan applications found for the provided application type.");
            return new ArrayList<>();
        }
        
        return loanApplications;
    }

    @GetMapping("/byApprovalStatus/{approvalStatus}")
    public List<LoanApplication> getLoanApplicationsByApprovalStatus(@PathVariable String approvalStatus) {
        return loanApplicationService.getLoanApplicationsByApprovalStatus(approvalStatus);
    }

    @GetMapping("/byApplicantId/{applicantId}")
    public List<LoanApplication> getLoanApplicationsByApplicantId(@PathVariable Long applicantId) {
        return loanApplicationService.getLoanApplicationsByApplicantId(applicantId);
    }

    @GetMapping("/byApplicantName/{applicantName}")
    public List<LoanApplication> getLoanApplicationsByApplicantName(@PathVariable String applicantName) {
        return loanApplicationService.getLoanApplicationsByApplicantName(applicantName);
    }

    @GetMapping("/byApplicantEmail/{applicantEmail}")
    public List<LoanApplication> getLoanApplicationsByApplicantEmail(@PathVariable String applicantEmail) {
        return loanApplicationService.getLoanApplicationsByApplicantEmail(applicantEmail);
    }

    // Other business methods can be removed here.

}