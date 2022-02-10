package com.example.main.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "links")
public class LinkModel {

    @Id
    @GeneratedValue
    private int id;
    private String url;
    private String odgovor_teme;
    private int klijent_id;
    private int zahtev_id;

    public LinkModel() {
    }

    public LinkModel(int id, String url, String odgovor_teme, int klijent_id, int zahtev_id) {
        this.id = id;
        this.url = url;
        this.odgovor_teme = odgovor_teme;
        this.klijent_id = klijent_id;
        this.zahtev_id = zahtev_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOdgovor_teme() {
        return odgovor_teme;
    }

    public void setOdgovor_teme(String odgovor_teme) {
        this.odgovor_teme = odgovor_teme;
    }

    public int getKlijent_id() {
        return klijent_id;
    }

    public void setKlijent_id(int klijent_id) {
        this.klijent_id = klijent_id;
    }

    public int getZahtev_id() {
        return zahtev_id;
    }

    public void setZahtev_id(int zahtev_id) {
        this.zahtev_id = zahtev_id;
    }
}
