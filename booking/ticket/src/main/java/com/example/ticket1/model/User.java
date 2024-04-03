package com.example.ticket1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userdetails")
public class User {
    @Id
   // @GeneratedValue(strategy =GenerationType.IDENTITY)
   private String emailId;
   @Column(name="Name")
    private String name;
    public User() {
    }
    public User(String name, String emailId) {
        this.name = name;
        this.emailId = emailId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
}