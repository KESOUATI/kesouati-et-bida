package com.club.sport.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;


@Entity
@Table


public class Reservation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private String nom;
    @Nullable

    private String catterrain;

    @Column
    private String datereservation;
    @Column
    private Float dureereservation;
    @Column
    private Long telephone;

    public Reservation() {
        super();
    }

    public Reservation(Long id, String nom, @Nullable String catterrain, String datereservation, Float dureereservation, Long telephone) {
        Id = id;
        this.nom = nom;
        this.catterrain = catterrain;
        this.datereservation = datereservation;
        this.dureereservation = dureereservation;
        this.telephone = telephone;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Nullable
    public String getCatterrain() {
        return catterrain;
    }

    public void setCatterrain(@Nullable String catterrain) {
        this.catterrain = catterrain;
    }

    public String getDatereservation() {
        return datereservation;
    }

    public void setDatereservation(String datereservation) {
        this.datereservation = datereservation;
    }

    public Float getDureereservation() {
        return dureereservation;
    }

    public void setDureereservation(Float dureereservation) {
        this.dureereservation = dureereservation;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }
}
