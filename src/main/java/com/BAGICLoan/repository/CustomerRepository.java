
package com.BAGICLoan.repository;

import com.BAGICLoan.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT c FROM Customer c WHERE c.identityVerification = ?1 AND c.addressVerification = ?2")
    Customer findByVerificationStatus(String identityVerification, String addressVerification);
}
