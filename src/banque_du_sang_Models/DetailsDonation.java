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
public class DetailsDonation {
    private int DonationNum;
    private int PocheNum;
    private String Hospital;
    private Date GivenDate;
    private int GivenAmount;
    private int DonataireID;

    public DetailsDonation() {
    }

    public DetailsDonation(int DonationNum, int PocheNum, int DonataireID, String Hospital, Date GivenDate, int GivenAmount) {
        this.DonationNum = DonationNum;
        this.PocheNum = PocheNum;
        this.Hospital = Hospital;
        this.GivenDate = GivenDate;
        this.GivenAmount = GivenAmount;
        this.DonataireID=DonataireID;
    }

    public int getDonataireID() {
        return DonataireID;
    }

    public void setDonataireID(int DonataireID) {
        this.DonataireID = DonataireID;
    }

    public int getDonationNum() {
        return DonationNum;
    }

    public void setDonationNum(int DonationNum) {
        this.DonationNum = DonationNum;
    }

    public int getPocheNum() {
        return PocheNum;
    }

    public void setPocheNum(int PocheNum) {
        this.PocheNum = PocheNum;
    }

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String Hospital) {
        this.Hospital = Hospital;
    }

    

    public Date getGivenDate() {
        return GivenDate;
    }

    public void setGivenDate(Date GivenDate) {
        this.GivenDate = GivenDate;
    }

    public int getGivenAmount() {
        return GivenAmount;
    }

    public void setGivenAmount(int GivenAmount) {
        this.GivenAmount = GivenAmount;
    }
    
}
