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

    public void setGraves(@Nullable Set<GraveDto> graves) {
        this.graves = graves;
    }

    public CemeteryDto(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long cemeteryId) {
        this.id = cemeteryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getTownShip() {
        return townShip;
    }

    public void setTownShip(String townShip) {
        this.townShip = townShip;
    }

    public String getCemRange() {
        return cemRange;
    }

    public void setCemRange(String cemRange) {
        this.cemRange = cemRange;
    }

    public String getSpot() {
        return spot;
    }

    public void setSpot(String spot) {
        this.spot = spot;
    }

    public String getFirstYear() {
        return firstYear;
    }

    public void setFirstYear(String firstYear) {
        this.firstYear = firstYear;
    }

    public String getCemSection() {
        return cemSection;
    }

    public void setCemSection(String cemSection) {
        this.cemSection = cemSection;
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

    public Integer getGraveCount() {
        return graveCount;
    }

    public void setGraveCount(Integer graveCount) {
        this.graveCount = graveCount;
    }
}
