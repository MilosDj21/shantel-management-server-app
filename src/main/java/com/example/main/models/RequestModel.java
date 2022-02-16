package com.example.main.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "zahtevi")
public class RequestModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String status;
    private String napomena;
    @Column(name = "nova_provera")
    private boolean novaProvera;
    @Column(name = "vreme_kreiranja")
    private Timestamp vremeKreiranja;

    /*@OneToMany(mappedBy = "zahtev")
    private List<LinkZaProveruModel> linkoviZaProveru = new ArrayList<>();
    */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "korisnik_id", referencedColumnName = "id")
    private UserModel korisnik;


    public RequestModel(){

    }

    public RequestModel(Long id, String status, String napomena, boolean novaProvera, Timestamp vremeKreiranja) {
        this.id = id;
        this.status = status;
        this.napomena = napomena;
        this.novaProvera = novaProvera;
        this.vremeKreiranja = vremeKreiranja;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public boolean isNovaProvera() {
        return novaProvera;
    }

    public void setNovaProvera(boolean novaProvera) {
        this.novaProvera = novaProvera;
    }

    public Timestamp getVremeKreiranja() {
        return vremeKreiranja;
    }

    public void setVremeKreiranja(Timestamp vremeKreiranja) {
        this.vremeKreiranja = vremeKreiranja;
    }

    /*public List<LinkZaProveruModel> getLinkoviZaProveru() {
        return linkoviZaProveru;
    }

    public void setLinkoviZaProveru(List<LinkZaProveruModel> linkoviZaProveru) {
        this.linkoviZaProveru = linkoviZaProveru;
    }*/

    public UserModel getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(UserModel korisnik) {
        this.korisnik = korisnik;
    }
}
