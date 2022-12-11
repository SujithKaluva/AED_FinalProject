/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem.Ecosystem;
import Business.Manufacturer.Manufacturer;
import Business.Person.Person;
import PasswordEncryption.PasswordEncryption;
import java.util.Date;

/**
 *
 * @author sujithkaluva
 */
public class FinanceAdmin extends Person {
    
    public static int finCounter = 1;
    private String financeAdminId;
    private String password;
    Manufacturer manufacturer;
    Ecosystem ecoSystem = Ecosystem.getInstance();
    DB4OUtil db4oUtil = DB4OUtil.getInstance();
    
    public FinanceAdmin(String password, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, Manufacturer manufacturer, String location) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber,location);
        financeAdminId = "financeAdmin_"+finCounter;
        finCounter++;
        this.manufacturer = manufacturer;
        this.password = PasswordEncryption.getEncryptedPassword(password);
        ecoSystem.getFinanceAdminDirectory().addFinanceAdmin(this);
         ecoSystem.passwordManager.addPassword("Finance Admin", emailId, this.password);
        //db4oUtil.storeSystem(ecoSystem);
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getFinanceAdminId() {
        return financeAdminId;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = PasswordEncryption.getEncryptedPassword(password);
    }
    
}
