package com.sscott.cemtrackerapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table
public class Grave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long graveId;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String deathDate;
    private String marriageYear;
    private String comment;
    private String graveNumber;
    private Long epochTimeAdded;
    private String addedBy;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cemeteryId")
    private Cemetery cemetery;


    public String getAddedBy() {
        return addedBy;
    }
    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public Long getGraveId() {
        return graveId;
    }
    public void setGraveId(Long graveId) {
        this.graveId = graveId;
    }


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDeathDate() {
        return deathDate;
    }
    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }

    public String getMarriageYear() {
        return marriageYear;
    }
    public void setMarriageYear(String marriageYear) {
        this.marriageYear = marriageYear;
    }

    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getGraveNumber() {
        return graveNumber;
    }
    public void setGraveNumber(String graveNumber) {
        this.graveNumber = graveNumber;
    }

    public Long getEpochTimeAdded() {
        return epochTimeAdded;
    }
    public void setEpochTimeAdded(Long epochTimeAdded) {
        this.epochTimeAdded = epochTimeAdded;
    }

    /*
        Make getter return cemetery.id in order to get json to send the cemetery id instead of whole cemetery object to client
     */

    public Long getCemetery() {
        return cemetery.getId();
    }

    public void setCemetery(Cemetery cemetery) {
        this.cemetery = cemetery;
    }
}


