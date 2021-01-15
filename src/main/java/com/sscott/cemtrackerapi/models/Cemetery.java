package com.sscott.cemtrackerapi.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Cemetery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cemeteryId;
    private String name;
    private String location;
    private String state;
    private String county;
    private String townShip;
    private String cemRange;
    private String spot;
    private String firstYear;
    private String cemSection;
    private Long epochTimeAdded;
    private String addedBy;
    private Integer graveCount;

    @OneToMany(mappedBy = "cemetery", cascade = CascadeType.ALL)
    private Set<Grave> graves = new HashSet<>();



    public Integer getGraveCount() {
        return graveCount;
    }
    public void setGraveCount(Integer graveCount) {
        this.graveCount = graveCount;
    }

    public String getAddedBy() {
        return addedBy;
    }
    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public Long getId() {
        return cemeteryId;
    }
    public void setId(Long id) {
        this.cemeteryId = id;
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

    public String getRange() {
        return cemRange;
    }
    public void setRange(String range) {
        this.cemRange = range;
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

    public String getSection() {
        return cemSection;
    }
    public void setSection(String section) {
        this.cemSection = section;
    }

    public Long getEpochTimeAdded() {
        return epochTimeAdded;
    }
    public void setEpochTimeAdded(Long epochTimeAdded) {
        this.epochTimeAdded = epochTimeAdded;
    }

    public Set<Grave> getGraves() {
        return graves;
    }
    public void setGraves(Set<Grave> graves) {
        this.graves = graves;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}
