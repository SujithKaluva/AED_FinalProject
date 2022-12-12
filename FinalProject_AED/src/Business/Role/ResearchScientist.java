/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.Person.Person;
import Business.Ecosystem.Ecosystem;
import Business.Manufacturer.Manufacturer;
import PasswordEncryption.PasswordEncryption;
import java.util.Date;

/**
 *
 * @author sujithkaluva
 */
public class ResearchScientist extends Person {

    public static int sciCounter = 1;
    private String reaserchScientistId;
    Manufacturer manufacturer;
    Ecosystem ecoSystem = Ecosystem.getInstance();
    private String password;

    public ResearchScientist(String password, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, Manufacturer manufacturer, String location) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber, location);
        reaserchScientistId = "reaserchScientist_" + sciCounter;
        sciCounter++;
        this.password = PasswordEncryption.getEncryptedPassword(password);
        this.manufacturer = manufacturer;
        ecoSystem.getResearchScientistDirectory().addResearchScientist(this);
        ecoSystem.passwordManager.addPassword("Research Scientist", emailId, this.password);
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = PasswordEncryption.getEncryptedPassword(password);
    }

    public String getReaserchScientistId() {
        return reaserchScientistId;
    }

}
