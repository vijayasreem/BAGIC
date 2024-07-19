package com.BAGICLoan.controller;

import com.BAGICLoan.model.LoanApplication;
import com.BAGICLoan.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/loan-application")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/in-person")
    public List<LoanApplication> getLoanApplicationsByInPersonChannel() {
        return loanApplicationService.findByInPersonChannel();
    }

    @GetMapping("/website")
    public List<LoanApplication> getLoanApplicationsByWebsiteChannel() {
        return loanApplicationService.findByWebsiteChannel();
    }

    @GetMapping("/mobile-app")
    public List<LoanApplication> getLoanApplicationsByMobileAppChannel() {
        return loanApplicationService.findByMobileAppChannel();
    }

    // Add more controller methods as needed

}