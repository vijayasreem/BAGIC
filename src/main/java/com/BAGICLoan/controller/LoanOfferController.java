package com.BAGICLoan.controller;

import com.BAGICLoan.model.LoanOffer;
import com.BAGICLoan.service.LoanOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loan-offer")
public class LoanOfferController {

    private final LoanOfferService loanOfferService;

    @Autowired
    public LoanOfferController(LoanOfferService loanOfferService) {
        this.loanOfferService = loanOfferService;
    }

    @GetMapping("/by-loan-amount/{loanAmount}")
    public ResponseEntity<LoanOffer> getLoanOfferByLoanAmount(@PathVariable double loanAmount) {
        LoanOffer loanOffer = loanOfferService.getLoanOfferByLoanAmount(loanAmount);
        if (loanOffer != null) {
            return new ResponseEntity<>(loanOffer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/by-interest-rate/{interestRate}")
    public ResponseEntity<LoanOffer> getLoanOfferByInterestRate(@PathVariable double interestRate) {
        LoanOffer loanOffer = loanOfferService.getLoanOfferByInterestRate(interestRate);
        if (loanOffer != null) {
            return new ResponseEntity<>(loanOffer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/by-repayment-period/{repaymentPeriod}")
    public ResponseEntity<LoanOffer> getLoanOfferByRepaymentPeriod(@PathVariable int repaymentPeriod) {
        LoanOffer loanOffer = loanOfferService.getLoanOfferByRepaymentPeriod(repaymentPeriod);
        if (loanOffer != null) {
            return new ResponseEntity<>(loanOffer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Add more endpoints for custom queries as per your requirements

}