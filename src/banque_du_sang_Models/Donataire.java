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
public class Donataire {
    private int DonataireID;
    private String DonataireNom;
    private String DonataireSexe;
    private Date DonataireDateNaiss;
    private String DonataireTypeSang;
    private String DonataireAdresse;
    private String DonataireVille;
    private int DonataireTele;

    public Donataire() {
    }

    public Donataire(int DonataireID, String DonataireNom, String DonataireSexe, Date DonataireDateNaiss, String DonataireTypeSang, String DonataireAdresse, String DonataireVille, int DonataireTele) {
        this.DonataireID = DonataireID;
        this.DonataireNom = DonataireNom;
        this.DonataireSexe = DonataireSexe;
        this.DonataireDateNaiss = DonataireDateNaiss;
        this.DonataireTypeSang = DonataireTypeSang;
        this.DonataireAdresse = DonataireAdresse;
        this.DonataireVille = DonataireVille;
        this.DonataireTele = DonataireTele;
    }

    public int getDonataireID() {
        return DonataireID;
    }

    public void setDonataireID(int DonataireID) {
        this.DonataireID = DonataireID;
    }

    public String getDonataireNom() {
        return DonataireNom;
    }

    public void setDonataireNom(String DonataireNom) {
        this.DonataireNom = DonataireNom;
    }

    public String getDonataireSexe() {
        return DonataireSexe;
    }

    public void setDonataireSexe(String DonataireSexe) {
        this.DonataireSexe = DonataireSexe;
    }

    public Date getDonataireDateNaiss() {
        return DonataireDateNaiss;
    }

    public void setDonataireDateNaiss(Date DonataireDateNaiss) {
        this.DonataireDateNaiss = DonataireDateNaiss;
    }

    public String getDonataireTypeSang() {
        return DonataireTypeSang;
    }

    public void setDonataireTypeSang(String DonataireTypeSang) {
        this.DonataireTypeSang = DonataireTypeSang;
    }

    public String getDonataireAdresse() {
        return DonataireAdresse;
    }

    public void setDonataireAdresse(String DonataireAdresse) {
        this.DonataireAdresse = DonataireAdresse;
    }

    public String getDonataireVille() {
        return DonataireVille;
    }

    public void setDonataireVille(String DonataireVille) {
        this.DonataireVille = DonataireVille;
    }

    public int getDonataireTele() {
        return DonataireTele;
    }

    public void setDonataireTele(int DonataireTele) {
        this.DonataireTele = DonataireTele;
    }



}
