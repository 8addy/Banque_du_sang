/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque_du_sang_Models;

import java.util.Date;

/**
 *
 * @author mmtsh
 */
public class Donneur {
    private int DonneurId;
    private String DonneurNom;
    private String DonneurSexe;
    private Date DonneurDateNaiss;
    private String DonneurTypeSang;
    private String DonneurAdresse;
    private String DonneurVille;
    private int DonneurTele;
    private String Eligibility;

    public Donneur() {
    }
    
    public Donneur(int DonneurId, String DonneurNom, String DonneurSexe, Date DonneurDateNaiss, String DonneurTypeSang, String DonneurAdresse, String DonneurVille, int DonneurTele, String Eligibility) {
        this.DonneurId = DonneurId;
        this.DonneurNom = DonneurNom;
        this.DonneurSexe = DonneurSexe;
        this.DonneurDateNaiss = DonneurDateNaiss;
        this.DonneurTypeSang = DonneurTypeSang;
        this.DonneurAdresse = DonneurAdresse;
        this.DonneurVille = DonneurVille;
        this.DonneurTele = DonneurTele;
        this.Eligibility = Eligibility;
    }

    public int getDonneurId() {
        return DonneurId;
    }

    public String getDonneurNom() {
        return DonneurNom;
    }

    public String getDonneurSexe() {
        return DonneurSexe;
    }

    public Date getDonneurDateNaiss() {
        return DonneurDateNaiss;
    }

    public String getDonneurTypeSang() {
        return DonneurTypeSang;
    }

    public String getDonneurAdresse() {
        return DonneurAdresse;
    }

    public String getDonneurVille() {
        return DonneurVille;
    }

    public int getDonneurTele() {
        return DonneurTele;
    }

    public String getEligibility() {
        return Eligibility;
    }

    public void setDonneurId(int DonneurId) {
        this.DonneurId = DonneurId;
    }

    public void setDonneurNom(String DonneurNom) {
        this.DonneurNom = DonneurNom;
    }

    public void setDonneurSexe(String DonneurSexe) {
        this.DonneurSexe = DonneurSexe;
    }

    public void setDonneurDateNaiss(Date DonneurDateNaiss) {
        this.DonneurDateNaiss = DonneurDateNaiss;
    }

    public void setDonneurTypeSang(String DonneurTypeSang) {
        this.DonneurTypeSang = DonneurTypeSang;
    }

    public void setDonneurAdresse(String DonneurAdresse) {
        this.DonneurAdresse = DonneurAdresse;
    }

    public void setDonneurVille(String DonneurVille) {
        this.DonneurVille = DonneurVille;
    }

    public void setDonneurTele(int DonneurTele) {
        this.DonneurTele = DonneurTele;
    }

    public void setEligibility(String Eligibility) {
        this.Eligibility = Eligibility;
    }

    

}
