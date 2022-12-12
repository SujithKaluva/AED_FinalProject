/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Manufacturer;

import Business.Data.VaccineDirectory;
import Business.Ecosystem.Ecosystem;
import Business.enterprise.Enterprise;
import Business.vaccine.Vaccine;
import PasswordEncryption.PasswordEncryption;
import java.util.ArrayList;

/**
 *
 * @author sreeja, sujith, dinesh
 */

public class Manufacturer {
    
    public static int counter = 1;
    private String manufacturerId;
    private String manufacturerName;
    private String emailId;
    private String password;
    Enterprise enterprise;
    ArrayList<Vaccine> vaccinelist;
    Ecosystem ecosystem = Ecosystem.getInstance();

    public Manufacturer(String manufacturerName, String emailId, Enterprise enterprise, ArrayList<Vaccine> vaccinelist,String password) {
        this.manufacturerName = manufacturerName;
        this.emailId = emailId;
        this.enterprise = enterprise;
        this.vaccinelist = vaccinelist;
        this.manufacturerId = "manufacturer_"+counter;
        this.password = PasswordEncryption.getEncryptedPassword(password);
        counter++;
        ecosystem.getManufacturerCatalog().addManufacturer(this);
        ecosystem.passwordManager.addPassword("Manufacturer", emailId, this.password);
    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public ArrayList<Vaccine> getVaccinelist() {
        return vaccinelist;
    }

    public void setVaccinelist(ArrayList<Vaccine> vaccinelist) {
        this.vaccinelist = vaccinelist;
    }
    
    public void addVaccine(Vaccine vObj){
        this.vaccinelist.add(vObj);
    }
    
    public void removeVaccine(Vaccine vObj){
        this.vaccinelist.remove(vObj);
    }
    
}
