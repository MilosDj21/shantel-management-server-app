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
}
