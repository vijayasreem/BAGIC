
package com.BAGICLoan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Case {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String caseNumber;
    private int caseYear;
    private String courtLocation;
    private String status;

    // Add getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public int getCaseYear() {
        return caseYear;
    }

    public void setCaseYear(int caseYear) {
        this.caseYear = caseYear;
    }

    public String getCourtLocation() {
        return courtLocation;
    }

    public void setCourtLocation(String courtLocation) {
        this.courtLocation = courtLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
