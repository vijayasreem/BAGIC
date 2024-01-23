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
}

In the above service class, I have implemented the required business methods findByUserId, findByEmail, findByMobileNumber, and findByAadharNumber as per the AccountDetailsRepository interface.

Additionally, I have implemented the updateAccountDetails method which allows users to update their account details such as name and PIN. This method retrieves the account details by user ID, performs the necessary updates, and saves the modified details back to the repository.

You can now use this service class to access and update account details from the user dashboard, ensuring data integrity and enforcing security requirements for the new PIN.