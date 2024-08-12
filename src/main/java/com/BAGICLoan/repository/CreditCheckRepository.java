
package com.BAGICLoan.repository;

import com.BAGICLoan.model.CreditCheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCheckRepository extends JpaRepository<CreditCheck, Long> {

    // Method to retrieve credit check by customer ID
    CreditCheck findByCustomerId(Long customerId);

    // Method to retrieve credit check by channel
    CreditCheck findByChannel(String channel);

    // Method to retrieve credit check by status
    CreditCheck findByStatus(String status);

    // Method to retrieve credit check by completion time
    CreditCheck findByCompletionTime(String completionTime);

    // Custom query to retrieve credit check by customer ID and channel
    @Query("SELECT c FROM CreditCheck c WHERE c.customerId = ?1 AND c.channel = ?2")
    CreditCheck findByCustomerIdAndChannel(Long customerId, String channel);

    // Custom query to retrieve credit check by customer ID and status
    @Query("SELECT c FROM CreditCheck c WHERE c.customerId = ?1 AND c.status = ?2")
    CreditCheck findByCustomerIdAndStatus(Long customerId, String status);

    // Custom query to retrieve credit check by customer ID and completion time
    @Query("SELECT c FROM CreditCheck c WHERE c.customerId = ?1 AND c.completionTime = ?2")
    CreditCheck findByCustomerIdAndCompletionTime(Long customerId, String completionTime);

    // Custom query to retrieve credit check by channel and status
    @Query("SELECT c FROM CreditCheck c WHERE c.channel = ?1 AND c.status = ?2")
    CreditCheck findByChannelAndStatus(String channel, String status);

    // Custom query to retrieve credit check by channel and completion time
    @Query("SELECT c FROM CreditCheck c WHERE c.channel = ?1 AND c.completionTime = ?2")
    CreditCheck findByChannelAndCompletionTime(String channel, String completionTime);

    // Custom query to retrieve credit check by status and completion time
    @Query("SELECT c FROM CreditCheck c WHERE c.status = ?1 AND c.completionTime = ?2")
    CreditCheck findByStatusAndCompletionTime(String status, String completionTime);

    // Custom query to retrieve credit check by customer ID, channel, and status
    @Query("SELECT c FROM CreditCheck c WHERE c.customerId = ?1 AND c.channel = ?2 AND c.status = ?3")
    CreditCheck findByCustomerIdAndChannelAndStatus(Long customerId, String channel, String status);

    // Custom query to retrieve credit check by customer ID, channel, and completion time
    @Query("SELECT c FROM CreditCheck c WHERE c.customerId = ?1 AND c.channel = ?2 AND c.completionTime = ?3")
    CreditCheck findByCustomerIdAndChannelAndCompletionTime(Long customerId, String channel, String completionTime);

    // Custom query to retrieve credit check by customer ID, status, and completion time
    @Query("SELECT c FROM CreditCheck c WHERE c.customerId = ?1 AND c.status = ?2 AND c.completionTime = ?3")
    CreditCheck findByCustomerIdAndStatusAndCompletionTime(Long customerId, String status, String completionTime);

    // Custom query to retrieve credit check by channel, status, and completion time
    @Query("SELECT c FROM CreditCheck c WHERE c.channel = ?1 AND c.status = ?2 AND c.completionTime = ?3")
    CreditCheck findByChannelAndStatusAndCompletionTime(String channel, String status, String completionTime);

    // Custom query to retrieve credit check by customer ID, channel, status, and completion time
    @Query("SELECT c FROM CreditCheck c WHERE c.customerId = ?1 AND c.channel = ?2 AND c.status = ?3 AND c.completionTime = ?4")
    CreditCheck findByCustomerIdAndChannelAndStatusAndCompletionTime(Long customerId, String channel, String status, String completionTime);
}
