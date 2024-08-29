package com.BAGICLoan.controller;

import com.BAGICLoan.model.Case;
import com.BAGICLoan.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cases")
public class CaseController {

    private final CaseService caseService;

    @Autowired
    public CaseController(CaseService caseService) {
        this.caseService = caseService;
    }

    @GetMapping("/{caseNumber}/{caseYear}")
    public Case findByCaseNumberAndYear(@PathVariable String caseNumber, @PathVariable int caseYear) {
        return caseService.findByCaseNumberAndYear(caseNumber, caseYear);
    }

    @GetMapping("/courtLocation/{courtLocation}")
    public List<Case> findByCourtLocation(@PathVariable String courtLocation) {
        return caseService.findByCourtLocation(courtLocation);
    }

    @GetMapping("/status/{status}")
    public List<Case> findByStatus(@PathVariable String status) {
        return caseService.findByStatus(status);
    }

    // Add more API endpoints for other business methods as needed

}