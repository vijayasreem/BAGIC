package com.BAGICLoan.service;

import com.BAGICLoan.model.Case;
import com.BAGICLoan.repository.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseService {

    private final CaseRepository caseRepository;

    @Autowired
    public CaseService(CaseRepository caseRepository) {
        this.caseRepository = caseRepository;
    }

    public Case findByCaseNumberAndCaseYear(String caseNumber, int caseYear) {
        return caseRepository.findByCaseNumberAndCaseYear(caseNumber, caseYear);
    }

    public List<Case> findByCourtLocation(String courtLocation) {
        return caseRepository.findByCourtLocation(courtLocation);
    }

    public List<Case> findByStatus(String status) {
        return caseRepository.findByStatus(status);
    }

    // Add more business methods as needed

}