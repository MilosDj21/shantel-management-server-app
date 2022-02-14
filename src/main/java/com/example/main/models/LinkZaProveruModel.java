package com.example.main.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "linkovi_za_proveru")
public class LinkZaProveruModel {
    @Id
    @GeneratedValue
    private int id;
    private String url;
    private String status;
    @Column(name = "vreme_provere")
    private Timestamp vremeProvere;
    private String teme;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "zahtev_id", referencedColumnName = "id")
    private RequestModel zahtev;

    public LinkZaProveruModel(){

    }

    public LinkZaProveruModel(int id, String url, String status, Timestamp vremeProvere, String teme) {
        this.id = id;
        this.url = url;
        this.status = status;
        this.vremeProvere = vremeProvere;
        this.teme = teme;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getVremeProvere() {
        return vremeProvere;
    }

    public void setVremeProvere(Timestamp vremeProvere) {
        this.vremeProvere = vremeProvere;
    }

    public String getTeme() {
        return teme;
    }

    public void setTeme(String teme) {
        this.teme = teme;
    }

    public RequestModel getZahtev() {
        return zahtev;
    }

    public void setZahtev(RequestModel zahtev) {
        this.zahtev = zahtev;
    }
}
