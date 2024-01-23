
package com.BAGICLoan.repository;

import com.BAGICLoan.model.AccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDetailsRepository extends JpaRepository<AccountDetails, Long> {
    AccountDetails findByUserId(Long userId);

    AccountDetails findByEmail(String email);

    AccountDetails findByMobileNumber(String mobileNumber);

    AccountDetails findByAadharNumber(String aadharNumber);
}
