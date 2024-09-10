
package com.example.crediteligibility.controller;

import com.example.crediteligibility.service.CreditEligibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditEligibilityController {

    @Autowired
    private CreditEligibilityService creditEligibilityService;

    @GetMapping("/checkEligibility")
    public String checkEligibility(@RequestParam double annualIncome, @RequestParam int creditScore) {
        return creditEligibilityService.checkEligibility(annualIncome, creditScore);
    }
}
