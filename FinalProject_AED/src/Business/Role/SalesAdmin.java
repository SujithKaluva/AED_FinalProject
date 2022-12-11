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
 * @author sreej
 */
public class SalesAdmin extends Person{
    public static int finCounter = 1;
    private String salesAdminId;
    private Manufacturer manufacturer;
    Ecosystem ecoSystem = Ecosystem.getInstance();
    private String password;
    
    public SalesAdmin(String password,String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, Manufacturer manufacturer, String location) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber, location);
        salesAdminId = "financeAdmin_"+finCounter;
        finCounter++;
        this.manufacturer = manufacturer;
        this.password = PasswordEncryption.getEncryptedPassword(password);
        ecoSystem.salesAdminDirectory.addSalesAdmin(this);
         ecoSystem.passwordManager.addPassword("Sales Admin", emailId, this.password);
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSalesAdminId() {
        return salesAdminId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = PasswordEncryption.getEncryptedPassword(password);
    }
    
    
}
