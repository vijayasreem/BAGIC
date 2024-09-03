
package com.BAGICLoan.repository;

import com.BAGICLoan.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT c FROM Customer c WHERE c.username = ?1")
    Customer findByUsername(String username);

    @Query("SELECT c FROM Customer c WHERE c.email = ?1")
    Customer findByEmail(String email);

    @Query("SELECT c FROM Customer c WHERE c.phoneNumber = ?1")
    Customer findByPhoneNumber(String phoneNumber);

    @Query("SELECT c FROM Customer c WHERE c.username = ?1 AND c.password = ?2")
    Customer findByUsernameAndPassword(String username, String password);

    @Query("SELECT c FROM Customer c WHERE c.username = ?1 AND c.mfaEnabled = true")
    Customer findByUsernameAndMfaEnabled(String username);

    @Query("SELECT c FROM Customer c WHERE c.email = ?1 AND c.mfaEnabled = true")
    Customer findByEmailAndMfaEnabled(String email);

    @Query("SELECT c FROM Customer c WHERE c.phoneNumber = ?1 AND c.mfaEnabled = true")
    Customer findByPhoneNumberAndMfaEnabled(String phoneNumber);

    @Query("SELECT c FROM Customer c WHERE c.username = ?1 AND c.mfaDeviceId = ?2")
    Customer findByUsernameAndMfaDeviceId(String username, String mfaDeviceId);

    @Query("SELECT c FROM Customer c WHERE c.email = ?1 AND c.mfaDeviceId = ?2")
    Customer findByEmailAndMfaDeviceId(String email, String mfaDeviceId);

    @Query("SELECT c FROM Customer c WHERE c.phoneNumber = ?1 AND c.mfaDeviceId = ?2")
    Customer findByPhoneNumberAndMfaDeviceId(String phoneNumber, String mfaDeviceId);

    @Query("UPDATE Customer c SET c.mfaEnabled = true WHERE c.id = ?1")
    void enableMfa(Long customerId);

    @Query("UPDATE Customer c SET c.mfaEnabled = false WHERE c.id = ?1")
    void disableMfa(Long customerId);

    @Query("UPDATE Customer c SET c.mfaDeviceId = ?2 WHERE c.id = ?1")
    void setMfaDeviceId(Long customerId, String mfaDeviceId);

    @Query("UPDATE Customer c SET c.failedMfaAttempts = c.failedMfaAttempts + 1 WHERE c.id = ?1")
    void incrementFailedMfaAttempts(Long customerId);

    @Query("UPDATE Customer c SET c.failedMfaAttempts = 0 WHERE c.id = ?1")
    void resetFailedMfaAttempts(Long customerId);

    @Query("UPDATE Customer c SET c.accountLocked = true WHERE c.id = ?1")
    void lockAccount(Long customerId);

    @Query("UPDATE Customer c SET c.accountLocked = false WHERE c.id = ?1")
    void unlockAccount(Long customerId);

    @Query("UPDATE Customer c SET c.accountLocked = true, c.failedMfaAttempts = 0 WHERE c.id = ?1")
    void lockAccountAndResetFailedMfaAttempts(Long customerId);
}
