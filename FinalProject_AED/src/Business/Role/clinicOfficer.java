/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Person.Person;
import java.util.Date;

/**
 *
 * @author tendusmac
 */
public class clinicOfficer extends Person {
    
    private String clinicId;
    public static int clinicCounter=1;
    
    public clinicOfficer(String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber);
        this.clinicId="Clinic_"+this.clinicCounter;
        clinicCounter++;
        
    }

    public String getClinicId() {
        return clinicId;
    }

    public void setClinicId(String clinicId) {
        this.clinicId = clinicId;
    }

   

    
    
    
}
