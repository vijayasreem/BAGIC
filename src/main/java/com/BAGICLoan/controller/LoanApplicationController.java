
package com.bank.loan.controller;

import com.bank.loan.model.LoanApplication;
import com.bank.loan.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loan-applications")
public class LoanApplicationController {

    @Autowired
    private LoanApplicationService loanApplicationService;

    @PostMapping
    public LoanApplication createLoanApplication(@RequestBody LoanApplication loanApplication) {
        LoanApplication savedApplication = loanApplicationService.saveLoanApplication(loanApplication);
        loanApplicationService.sendConfirmationEmail(savedApplication);
        return savedApplication;
    }

    @GetMapping("/{id}")
    public LoanApplication getLoanApplication(@PathVariable Long id) {
        return loanApplicationService.getLoanApplication(id);
    }
}
