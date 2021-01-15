package com.sscott.cemtrackerapi.models;

import com.sun.istack.Nullable;

import javax.persistence.*;

@Entity
@Table
public class User {

    //constructors

    public User() {

    }

    public User(
            String email,
            String userName,
            String password,
            Boolean active,
            String roles,
            Integer gravesAdded,
            Integer cemeteriesAdded

    ){
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.roles = roles;
        this.cemeteriesAdded = cemeteriesAdded;
        this.gravesAdded = gravesAdded;
    }


    @Id
    private String email;
    private String userName;
    private String password;
    private boolean active;
    private String roles;

    @Nullable
    private Integer gravesAdded;
    @Nullable
    private Integer cemeteriesAdded;

    public Integer getGravesAdded() {
        return gravesAdded;
    }

    public void setGravesAdded(Integer gravesAdded) {
        this.gravesAdded = gravesAdded;
    }

    public Integer getCemeteriesAdded() {
        return cemeteriesAdded;
    }

    public void setCemeteriesAdded(Integer cemeteriesAdded) {
        this.cemeteriesAdded = cemeteriesAdded;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
