
package com.BAGICLoan.model;

import javax.persistence.*;

@Entity
@Table(name = "account_details")
public class AccountDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    
    private String email;
    
    private String mobileNumber;
    
    private String aadharNumber;

    // Constructors, getters, and setters

    public AccountDetails() {
    }

    public AccountDetails(Long userId, String email, String mobileNumber, String aadharNumber) {
        this.userId = userId;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.aadharNumber = aadharNumber;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }
}
