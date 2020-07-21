package com.projekat.XML.dtos;

public class LoginInfoDTO {
    private String username;
    private String password;
    private String email;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public LoginInfoDTO() {
    }

    public LoginInfoDTO(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }


}