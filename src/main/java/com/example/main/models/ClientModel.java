package com.example.main.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "klijenti")
public class ClientModel {
    @Id
    @GeneratedValue
    private int id;
    private String kontakt_osoba;
    private String email;
    private String napomena;
    private Timestamp vreme_izmene;

    /*@OneToMany(mappedBy = "klijent")
    private List<LinkModel> linkovi = new ArrayList<>();
    */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "korisnik_id", referencedColumnName = "id")
    private UserModel korisnik;

    public ClientModel() {
    }

    public ClientModel(int id, String kontakt_osoba, String email, String napomena, Timestamp vreme_izmene) {
        this.id = id;
        this.kontakt_osoba = kontakt_osoba;
        this.email = email;
        this.napomena = napomena;
        this.vreme_izmene = vreme_izmene;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKontakt_osoba() {
        return kontakt_osoba;
    }

    public void setKontakt_osoba(String kontakt_osoba) {
        this.kontakt_osoba = kontakt_osoba;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public Timestamp getVreme_izmene() {
        return vreme_izmene;
    }

    public void setVreme_izmene(Timestamp vreme_izmene) {
        this.vreme_izmene = vreme_izmene;
    }

    /*public List<LinkModel> getLinkovi() {
        return linkovi;
    }

    public void setLinkovi(List<LinkModel> linkovi) {
        this.linkovi = linkovi;
    }*/

    public UserModel getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(UserModel korisnik) {
        this.korisnik = korisnik;
    }
}
