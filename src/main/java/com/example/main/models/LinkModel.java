package com.example.main.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "linkovi")
public class LinkModel {

    @Id
    @GeneratedValue
    private int id;
    private String url;
    @Column(name = "nas_url")
    private String nasUrl;
    private double cena;
    @Column(name = "vreme_placanja")
    private Timestamp vremePlacanja;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "klijent_id", referencedColumnName = "id")
    private ClientModel klijent;

    public LinkModel() {
    }

    public LinkModel(int id, String url, String nasUrl, double cena, Timestamp vremePlacanja) {
        this.id = id;
        this.url = url;
        this.nasUrl = nasUrl;
        this.cena = cena;
        this.vremePlacanja = vremePlacanja;
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

    public String getNasUrl() {
        return nasUrl;
    }

    public void setNasUrl(String nasUrl) {
        this.nasUrl = nasUrl;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Timestamp getVremePlacanja() {
        return vremePlacanja;
    }

    public void setVremePlacanja(Timestamp vremePlacanja) {
        this.vremePlacanja = vremePlacanja;
    }

    public ClientModel getKlijent() {
        return klijent;
    }

    public void setKlijent(ClientModel klijent) {
        this.klijent = klijent;
    }
}
