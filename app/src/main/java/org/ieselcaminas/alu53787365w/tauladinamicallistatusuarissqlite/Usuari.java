package org.ieselcaminas.alu53787365w.tauladinamicallistatusuarissqlite;

/**
 * Created by santi on 27/04/18.
 */

public class Usuari {
    private int ID;
    private String nom;
    private int depart;
    private int edat;
    private double sou;

    public Usuari(int ID, String nom, int depart, int edat, double sou) {

        this.ID = ID;
        this.nom = nom;
        this.depart = depart;
        this.edat = edat;
        this.sou = sou;
    }

    public Usuari(String nom, int depart, int edat, double sou) {
        this.nom = nom;
        this.depart = depart;
        this.edat = edat;
        this.sou = sou;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDepart() {
        return depart;
    }

    public void setDepart(int depart) {
        this.depart = depart;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }
}
