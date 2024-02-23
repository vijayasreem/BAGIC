package com.BAGICLoan.controller;

import com.BAGICLoan.model.LoanApplication;
import com.BAGICLoan.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/loanApplications")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/byApplicationType/{applicationType}")
    public Map<String, List<LoanApplication>> getLoanApplicationsByApplicationType(@PathVariable String applicationType) {
        List<LoanApplication> loanApplications = loanApplicationService.getLoanApplicationsByApplicationType(applicationType);
        
        if (loanApplications.isEmpty()) {
            System.out.println("No loan applications found for the provided application type.");
            return new HashMap<>();
        }
        
        Map<String, List<LoanApplication>> loanApplicationsByApplicantName = loanApplications.stream()
                .collect(Collectors.groupingBy(LoanApplication::getApplicantName));
        
        return loanApplicationsByApplicantName;
    }

    @GetMapping("/byApprovalStatus/{approvalStatus}/{applicantName}")
    public List<LoanApplication> getLoanApplicationsByApprovalStatus(@PathVariable String approvalStatus, @PathVariable String applicantName) {
        return loanApplicationService.getLoanApplicationsByApprovalStatusAndName(approvalStatus, applicantName);
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
}
