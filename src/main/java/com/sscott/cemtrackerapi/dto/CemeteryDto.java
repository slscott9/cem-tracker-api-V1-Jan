package com.sscott.cemtrackerapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.springframework.lang.Nullable;

import java.util.HashSet;
import java.util.Set;


public class CemeteryDto {

    @Nullable
    private Long id;
    @Nullable
    private String name;
    @Nullable
    private String location;
    @Nullable
    private String state;
    @Nullable
    private String county;
    @Nullable
    private String townShip;
    @Nullable
    private String cemRange;
    @Nullable
    private String spot;
    @Nullable
    private String firstYear;
    @Nullable
    private String cemSection;
    @Nullable
    private Long epochTimeAdded;
    @Nullable
    private String addedBy;
    @Nullable
    private Integer graveCount;

    @Nullable
    private Set<GraveDto> graves = new HashSet<>();

    @Nullable
    public Set<GraveDto> getGraves() {
        return graves;
    }


    @Nullable
    public Long getId() {
        return id;
    }

    public void setId(@Nullable Long id) {
        this.id = id;
    }

    @Nullable
    public String getName() {
        return name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }

    @Nullable
    public String getLocation() {
        return location;
    }

    public void setLocation(@Nullable String location) {
        this.location = location;
    }

    @Nullable
    public String getState() {
        return state;
    }

    public void setState(@Nullable String state) {
        this.state = state;
    }

    @Nullable
    public String getCounty() {
        return county;
    }

    public void setCounty(@Nullable String county) {
        this.county = county;
    }

    @Nullable
    public String getTownShip() {
        return townShip;
    }

    public void setTownShip(@Nullable String townShip) {
        this.townShip = townShip;
    }

    @Nullable
    public String getCemRange() {
        return cemRange;
    }

    public void setCemRange(@Nullable String cemRange) {
        this.cemRange = cemRange;
    }

    @Nullable
    public String getSpot() {
        return spot;
    }

    public void setSpot(@Nullable String spot) {
        this.spot = spot;
    }

    @Nullable
    public String getFirstYear() {
        return firstYear;
    }

    public void setFirstYear(@Nullable String firstYear) {
        this.firstYear = firstYear;
    }

    @Nullable
    public String getCemSection() {
        return cemSection;
    }

    public void setCemSection(@Nullable String cemSection) {
        this.cemSection = cemSection;
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
    public Integer getGraveCount() {
        return graveCount;
    }

    public void setGraveCount(@Nullable Integer graveCount) {
        this.graveCount = graveCount;
    }

    public void setGraves(@Nullable Set<GraveDto> graves) {
        this.graves = graves;
    }
}
