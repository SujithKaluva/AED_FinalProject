/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Clinic.Clinic;
import Business.Ecosystem.Ecosystem;
import Business.Person.Person;
import PasswordEncryption.PasswordEncryption;
import java.util.Date;

/**
 *
 * @author tendusmac
 */
public class clinicOfficer extends Person {

    private String clinicId;
    public static int clinicCounter = 1;
    private String password;
    private Clinic clinic;
    Ecosystem ecoSystem = Ecosystem.getInstance();

    public clinicOfficer(String password, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, Clinic clinic, String location) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber, location);
        this.clinicId = "Clinic_" + this.clinicCounter;
        clinicCounter++;
        this.clinic = clinic;
        this.password = PasswordEncryption.getEncryptedPassword(password);
        ecoSystem.getClinicofficerdirectory().addOfficer(this);
        ecoSystem.passwordManager.addPassword("Clinic Officer", emailId, this.password);
    }

    public String getClinicId() {
        return clinicId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = PasswordEncryption.getEncryptedPassword(password);
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

}
