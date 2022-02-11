package com.example.main.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Random;

@Entity
public class SessionModel {
    @Id
    @GeneratedValue
    private int id;
    private UserModel userModel;
    private String token;
    private Timestamp sessionCreate;
    private Timestamp sessionEnd;

    public SessionModel() {
    }

    public SessionModel(int id, UserModel userModel, Timestamp sessionCreate, Timestamp sessionEnd) {
        this.id = id;
        this.userModel = userModel;
        Random r = new Random();
        String token = "";
        for(int i=0;i<7;i++){
            token += String.valueOf(r.nextInt(10));
            token += String.valueOf((char)(r.nextInt(26) + 'a'));
        }
        this.token = token;
        this.sessionCreate = sessionCreate;
        this.sessionEnd = sessionEnd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Timestamp getSessionCreate() {
        return sessionCreate;
    }

    public void setSessionCreate(Timestamp sessionCreate) {
        this.sessionCreate = sessionCreate;
    }

    public Timestamp getSessionEnd() {
        return sessionEnd;
    }

    public void setSessionEnd(Timestamp sessionEnd) {
        this.sessionEnd = sessionEnd;
    }
}
