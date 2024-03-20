
package com.BAGICLoan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String identityVerification;
    private String addressVerification;

    // getters and setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getIdentityVerification() {
        return identityVerification;
    }
    
    public void setIdentityVerification(String identityVerification) {
        this.identityVerification = identityVerification;
    }
    
    public String getAddressVerification() {
        return addressVerification;
    }
    
    public void setAddressVerification(String addressVerification) {
        this.addressVerification = addressVerification;
    }
}
