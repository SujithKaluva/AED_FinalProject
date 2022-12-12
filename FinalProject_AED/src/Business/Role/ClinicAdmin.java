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
 * @author sreej
 */
public class ClinicAdmin extends Person {

    Ecosystem ecoSystem = Ecosystem.getInstance();

    private String clinicId;
    private static int vidCounter = 1;
    private String password;
    private Clinic clinic;

    public ClinicAdmin(String Password, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, Clinic clinic, String location) {

        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber,location);
        this.clinicId = "ca_" + this.vidCounter + 1;
        this.vidCounter++;
        this.password = PasswordEncryption.getEncryptedPassword(Password);
        this.clinic = clinic;

        ecoSystem.clinicAdminDirectory.addClinicAdmin(this);
        ecoSystem.passwordManager.addPassword("Clinic Admin", emailId, this.password);
        //SMTPMail.sendEmailMessage(emailId, "Registration Successful!", "Hello!");
        //db4oUtil.storeSystem(ecoSystem);

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

    public String getClinicId() {
        return clinicId;
    }

}
