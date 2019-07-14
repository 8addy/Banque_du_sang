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
public class Manager {
    private int ManagerId;
    private String ManagerNom;
    private String Email;
    private String Password;

    public Manager() {
    }

    public int getManagerId() {
        return ManagerId;
    }

    public void setManagerId(int ManagerId) {
        this.ManagerId = ManagerId;
    }

    public String getManagerNom() {
        return ManagerNom;
    }

    public void setManagerNom(String ManagerNom) {
        this.ManagerNom = ManagerNom;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    
}
