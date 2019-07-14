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
public class Employee {
    private int EmployeeId;
    private String EmployeeNom;
    private String EmployeeAdresse;
    private int EmployeeSalaire;
    private int EmployeeTele;

    public Employee() {
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public String getEmployeeNom() {
        return EmployeeNom;
    }

    public void setEmployeeNom(String EmployeeNom) {
        this.EmployeeNom = EmployeeNom;
    }

    public String getEmployeeAdresse() {
        return EmployeeAdresse;
    }

    public void setEmployeeAdresse(String EmployeeAdresse) {
        this.EmployeeAdresse = EmployeeAdresse;
    }

    public int getEmployeeSalaire() {
        return EmployeeSalaire;
    }

    public void setEmployeeSalaire(int EmployeeSalaire) {
        this.EmployeeSalaire = EmployeeSalaire;
    }

    public int getEmployeeTele() {
        return EmployeeTele;
    }

    public void setEmployeeTele(int EmployeeTele) {
        this.EmployeeTele = EmployeeTele;
    }
    
    
}
