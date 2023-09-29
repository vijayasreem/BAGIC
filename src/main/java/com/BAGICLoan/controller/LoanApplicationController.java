package com.BAGICLoan.controller;

import com.BAGICLoan.model.LoanApplication;
import com.BAGICLoan.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return loanApplicationService.getLoanApplicationsByApplicationType(applicationType);
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

    // Other business methods can be added here

}