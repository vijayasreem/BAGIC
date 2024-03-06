package com.BAGICLoan.service;

import com.BAGICLoan.model.LoanOffer;
import com.BAGICLoan.repository.LoanOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanOfferService {

    private final LoanOfferRepository loanOfferRepository;

    @Autowired
    public LoanOfferService(LoanOfferRepository loanOfferRepository) {
        this.loanOfferRepository = loanOfferRepository;
    }

    public LoanOffer getLoanOfferByLoanAmount(double loanAmount) {
        return loanOfferRepository.findByLoanAmount(loanAmount);
    }

    public LoanOffer getLoanOfferByInterestRate(double interestRate) {
        return loanOfferRepository.findByInterestRate(interestRate);
    }

    public LoanOffer getLoanOfferByRepaymentPeriod(int repaymentPeriod) {
        return loanOfferRepository.findByRepaymentPeriod(repaymentPeriod);
    }

    // Add more business methods for custom queries as per your requirements

}