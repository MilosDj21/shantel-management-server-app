package com.example.main.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "clients")
public class ClientModel {
    @Id
    @GeneratedValue
    private int id;
    private String domen;
    private String kontakt_osoba;
    private String email;
    private String status;
    private String napomena;
    private Timestamp vreme_izmene;
    private int izmena_manager_id;
    private int zahtev_id;

    public ClientModel() {
    }

    public ClientModel(int id, String domen, String kontakt_osoba, String email, String status, String napomena, Timestamp vreme_izmene, int izmena_manager_id, int zahtev_id) {
        this.id = id;
        this.domen = domen;
        this.kontakt_osoba = kontakt_osoba;
        this.email = email;
        this.status = status;
        this.napomena = napomena;
        this.vreme_izmene = vreme_izmene;
        this.izmena_manager_id = izmena_manager_id;
        this.zahtev_id = zahtev_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDomen() {
        return domen;
    }

    public void setDomen(String domen) {
        this.domen = domen;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public int getIzmena_manager_id() {
        return izmena_manager_id;
    }

    public void setIzmena_manager_id(int izmena_manager_id) {
        this.izmena_manager_id = izmena_manager_id;
    }

    public int getZahtev_id() {
        return zahtev_id;
    }

    public void setZahtev_id(int zahtev_id) {
        this.zahtev_id = zahtev_id;
    }
}
