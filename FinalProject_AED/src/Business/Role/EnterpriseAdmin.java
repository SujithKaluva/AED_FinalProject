/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem.Ecosystem;
import Business.Person.Person;
import PasswordEncryption.PasswordEncryption;
import java.util.Date;

/**
 *
 * @author sujithkaluva
 */
public class EnterpriseAdmin extends Person{
    
    public static int entAdminCounter = 1;
    private String entAdminId;
    private String password;
    Ecosystem ecosystem = Ecosystem.getInstance();
    
    public EnterpriseAdmin(String password, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, String location) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber,location);
        entAdminId = "entAdmin_" + entAdminCounter;
        entAdminCounter++;
        this.password = PasswordEncryption.getEncryptedPassword(password);
        ecosystem.getEnterpriseAdminDirectory().addEnterpriseAdmin(this);
        ecosystem.passwordManager.addPassword("Enterprise Admin", emailId, this.password);
    }

    public String getEntAdminId() {
        return entAdminId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = PasswordEncryption.getEncryptedPassword(password);
    }
     
}
