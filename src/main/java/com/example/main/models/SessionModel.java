package com.example.main.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Random;

@Entity
@Table(name = "sesije")
public class SessionModel {
    @Id
    @GeneratedValue
    private int id;
    private String token;
    @Column(name = "vreme_kreiranja")
    private Timestamp vremeKreiranja;
    @Column(name = "vreme_zavrsetka")
    private Timestamp vremeZavrsetka;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "korisnik_id")
    private UserModel korisnik;

    public SessionModel() {
    }

    /**
     * Za kreiranje nove sesije
     * @param korisnik
     */
    public SessionModel(UserModel korisnik) {
        this.korisnik = korisnik;
        Random r = new Random();
        String token = "";
        for(int i=0;i<7;i++){
            token += String.valueOf(r.nextInt(10));
            token += String.valueOf((char)(r.nextInt(26) + 'a'));
        }
        this.token = token;
        this.vremeKreiranja = new Timestamp(System.currentTimeMillis());
        this.vremeZavrsetka = null;
    }

    public SessionModel(int id, String token, Timestamp vremeKreiranja, Timestamp vremeZavrsetka) {
        this.id = id;
        this.token = token;
        this.vremeKreiranja = vremeKreiranja;
        this.vremeZavrsetka = vremeZavrsetka;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserModel getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(UserModel korisnik) {
        this.korisnik = korisnik;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Timestamp getVremeKreiranja() {
        return vremeKreiranja;
    }

    public void setVremeKreiranja(Timestamp vremeKreiranja) {
        this.vremeKreiranja = vremeKreiranja;
    }

    public Timestamp getVremeZavrsetka() {
        return vremeZavrsetka;
    }

    public void setVremeZavrsetka(Timestamp vremeZavrsetka) {
        this.vremeZavrsetka = vremeZavrsetka;
    }
}
