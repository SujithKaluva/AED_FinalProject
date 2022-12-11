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
 * @author tendusmac
 */
public class clinicProvider extends Person {

    private String clinicproviderId;
    private static int clinicproviderCounter = 1;
    private String password;
    Ecosystem ecoSystem = Ecosystem.getInstance();

    public clinicProvider(String password,String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, String location) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber, location);
        this.clinicproviderId = "clinicproviderId_" + this.clinicproviderCounter;
        clinicproviderCounter++;
        this.password = PasswordEncryption.getEncryptedPassword(password);
        ecoSystem.getClinicProviderDirectory().addClinicProvider(this);
        ecoSystem.passwordManager.addPassword("Clinic Provider", emailId, this.password);

    }

    public String getClinicproviderId() {
        return clinicproviderId;
    }

    public void setClinicproviderId(String clinicproviderId) {
        this.clinicproviderId = clinicproviderId;
    }

}
