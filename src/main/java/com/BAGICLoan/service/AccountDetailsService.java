package com.BAGICLoan.service;

import com.BAGICLoan.model.AccountDetails;
import com.BAGICLoan.repository.AccountDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountDetailsService {

    private final AccountDetailsRepository accountDetailsRepository;

    @Autowired
    public AccountDetailsService(AccountDetailsRepository accountDetailsRepository) {
        this.accountDetailsRepository = accountDetailsRepository;
    }

    public AccountDetails findByUserId(Long userId) {
        return accountDetailsRepository.findByUserId(userId);
    }

    public AccountDetails findByEmail(String email) {
        return accountDetailsRepository.findByEmail(email);
    }

    public AccountDetails findByMobileNumber(String mobileNumber) {
        return accountDetailsRepository.findByMobileNumber(mobileNumber);
    }

    public AccountDetails findByAadharNumber(String aadharNumber) {
        return accountDetailsRepository.findByAadharNumber(aadharNumber);
    }

    public AccountDetails updateAccountDetails(Long userId, String name, String pin) {
        AccountDetails accountDetails = accountDetailsRepository.findByUserId(userId);

        if (accountDetails != null) {
            accountDetails.setName(name);
            accountDetails.setPin(pin);

            // Perform additional validation and data integrity checks here

            return accountDetailsRepository.save(accountDetails);
        }

        return null;
    }
    
    public AccountDetails findByPhone(String phoneNumber) {
        return accountDetailsRepository.findByPhone(phoneNumber);
    }
}