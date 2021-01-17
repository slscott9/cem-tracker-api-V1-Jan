package com.sscott.cemtrackerapi.dto;

public class GraveDto {

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
    private Long cemetery;


    public Long getCemetery() {
        return cemetery;
    }

    public void setCemetery(Long cemetery) {
        this.cemetery = cemetery;
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

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }
}
