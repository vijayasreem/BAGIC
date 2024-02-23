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

    @GetMapping("/byApplicationType")
    public Map<String, List<LoanApplication>> getLoanApplicationsByApplicationType(@RequestParam List<String> applicationTypes) {
        Map<String, List<LoanApplication>> loanApplicationsByApplicantName = new HashMap<>();
        
        for(String applicationType : applicationTypes) {
            List<LoanApplication> loanApplications = loanApplicationService.getLoanApplicationsByApplicationType(applicationType);
            
            if (!loanApplications.isEmpty()) {
                // Group the loan applications by the applicant name
                loanApplicationsByApplicantName.putAll(loanApplications.stream()
                        .collect(Collectors.groupingBy(LoanApplication::getApplicantName)));
            }
        }
        
        if (loanApplicationsByApplicantName.isEmpty()) {
            // Return an empty list with a message indicating no applications were found
            System.out.println("No loan applications found for the provided application types.");
        }
        
        return loanApplicationsByApplicantName;
    }

    // Rest of the code remains the same
}
