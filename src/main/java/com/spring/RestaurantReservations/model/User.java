package com.spring.RestaurantReservations.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    @Transient
    private String cnfPassword;
    private String role;

    public User() {
    }
    public User(String username, String password, String cnfPassword, String role) {
        this.username = username;
        this.password = password;
        this.cnfPassword = cnfPassword;
        this.role = role;
    }

    public User(int id, String username, String password, String cnfPassword, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.cnfPassword = cnfPassword;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCnfPassword() {
        return cnfPassword;
    }

    public void setCnfPassword(String cnfPassword) {
        this.cnfPassword = cnfPassword;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", cnfPassword='" + cnfPassword + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
