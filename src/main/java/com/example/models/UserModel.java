package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class UserModel {
    @GeneratedValue
    private long id;
    private String status;
    private String ime;
    private String prezime;
    private String username;
    private String password;
    private String ui_tema;

    public UserModel() {
    }

    public UserModel(long id, String status, String ime, String prezime, String username, String password, String ui_tema) {
        this.id = id;
        this.status = status;
        this.ime = ime;
        this.prezime = prezime;
        this.username = username;
        this.password = password;
        this.ui_tema = ui_tema;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
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

    public String getUi_tema() {
        return ui_tema;
    }

    public void setUi_tema(String ui_tema) {
        this.ui_tema = ui_tema;
    }
}
