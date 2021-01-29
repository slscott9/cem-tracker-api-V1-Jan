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
    @Nullable
    private Long cemId;


    @Nullable
    public Long getGraveId() {
        return graveId;
    }

    public void setGraveId(@Nullable Long graveId) {
        this.graveId = graveId;
    }

    @Nullable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(@Nullable String firstName) {
        this.firstName = firstName;
    }

    @Nullable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(@Nullable String lastName) {
        this.lastName = lastName;
    }

    @Nullable
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(@Nullable String birthDate) {
        this.birthDate = birthDate;
    }

    @Nullable
    public String getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(@Nullable String deathDate) {
        this.deathDate = deathDate;
    }

    @Nullable
    public String getMarriageYear() {
        return marriageYear;
    }

    public void setMarriageYear(@Nullable String marriageYear) {
        this.marriageYear = marriageYear;
    }

    @Nullable
    public String getComment() {
        return comment;
    }

    public void setComment(@Nullable String comment) {
        this.comment = comment;
    }

    @Nullable
    public String getGraveNumber() {
        return graveNumber;
    }

    public void setGraveNumber(@Nullable String graveNumber) {
        this.graveNumber = graveNumber;
    }

    @Nullable
    public Long getEpochTimeAdded() {
        return epochTimeAdded;
    }

    public void setEpochTimeAdded(@Nullable Long epochTimeAdded) {
        this.epochTimeAdded = epochTimeAdded;
    }

    @Nullable
    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(@Nullable String addedBy) {
        this.addedBy = addedBy;
    }

    @Nullable
    public Long getCemId() {
        return cemId;
    }

    public void setCemId(@Nullable Long cemetery) {
        this.cemId = cemetery;
    }
}
