/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque_du_sang_Models;

/**
 *
 * @author mmtsh
 */
public class StockSang {
    private int PocheNum;
    private int DonneurID;
    private int QuantityDisponible;
    private String GlobulesRouges;
    private String GlobulesBlanc;
    private String Plaquette;
    private String Plasma;

    public StockSang() {
    }

    public StockSang(int PocheNum, int DonneurID, int QuantityDisponible, String GlobulesRouges, String GlobulesBlanc, String Plaquette, String Plasma) {
        this.PocheNum = PocheNum;
        this.DonneurID = DonneurID;
        this.QuantityDisponible = QuantityDisponible;
        this.GlobulesRouges = GlobulesRouges;
        this.GlobulesBlanc = GlobulesBlanc;
        this.Plaquette = Plaquette;
        this.Plasma = Plasma;
    }

    public int getPocheNum() {
        return PocheNum;
    }

    public void setPocheNum(int PocheNum) {
        this.PocheNum = PocheNum;
    }

    public int getDonneurID() {
        return DonneurID;
    }

    public void setDonneurID(int DonneurID) {
        this.DonneurID = DonneurID;
    }

    public int getQuantityDisponible() {
        return QuantityDisponible;
    }

    public void setQuantityDisponible(int QuantityDisponible) {
        this.QuantityDisponible = QuantityDisponible;
    }

    public String getGlobulesRouges() {
        return GlobulesRouges;
    }

    public void setGlobulesRouges(String GlobulesRouges) {
        this.GlobulesRouges = GlobulesRouges;
    }

    public String getGlobulesBlanc() {
        return GlobulesBlanc;
    }

    public void setGlobulesBlanc(String GlobulesBlanc) {
        this.GlobulesBlanc = GlobulesBlanc;
    }

    public String getPlaquette() {
        return Plaquette;
    }

    public void setPlaquette(String Plaquette) {
        this.Plaquette = Plaquette;
    }

    public String getPlasma() {
        return Plasma;
    }

    public void setPlasma(String Plasma) {
        this.Plasma = Plasma;
    }
    
}
