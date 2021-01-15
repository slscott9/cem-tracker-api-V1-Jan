package com.sscott.cemtrackerapi.dto;


import org.springframework.lang.Nullable;

public class UserDto {

    @Nullable
    private String userName;
    @Nullable
    private String email;
    @Nullable
    private String password;
    @Nullable
    private Integer gravesAdded;
    @Nullable
    private Integer cemeteriesAdded;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
