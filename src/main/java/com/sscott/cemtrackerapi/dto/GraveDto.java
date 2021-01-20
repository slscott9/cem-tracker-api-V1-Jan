package com.sscott.cemtrackerapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.Nullable;

public class GraveDto {

    @Nullable
    private Long graveId;
    @Nullable
    private String firstName;
    @Nullable
    private String lastName;
    @Nullable
    private String birthDate;
    @Nullable
    private String deathDate;
    @Nullable
    private String marriageYear;
    @Nullable
    private String comment;
    @Nullable
    private String graveNumber;
    @Nullable
    private Long epochTimeAdded;
    @Nullable
    private String addedBy;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Nullable
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
