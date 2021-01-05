package com.tpRest.productREST.Entity;

import javax.persistence.*;

@Entity
@Table(	name = "client")
public class Client {
    private Integer id;
    private String nom;
    private String prenom;
    private String identifiant;
    private String password;

    public Client(){

    }

    public Client(Integer id, String nom, String prenom, String identifiant, String password) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
