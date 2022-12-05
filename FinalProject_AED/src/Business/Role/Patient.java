/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem.Ecosystem;
import Business.Person.Person;
import com.db4o.ObjectContainer;
import java.util.*;


/**
 *
 * @author tendusmac
 */
public class Patient extends Person {
    
    Ecosystem ecoSystem = Ecosystem.getInstance();
    DB4OUtil db4oUtil = DB4OUtil.getInstance();
    private String PatientId;
    public static int patientCounter=1;
    private String password;

    public Patient(String password, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber);
        this.PatientId = "patient_"+patientCounter;
        this.password = PasswordEncryption.PasswordEncryption.getEncryptedPassword(password);
        patientCounter++;
        ecoSystem.patientdirectory.addPatient(this);
        System.out.print(ecoSystem.patientdirectory.getPatientdirectory().size());
        
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = PasswordEncryption.PasswordEncryption.getEncryptedPassword(password);
    }
   
    public String getPatientId() {
        return PatientId;
    }
    
}