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
public class clinicProvider extends Person{
    
    private String clinicproviderId;
    private static int clinicproviderCounter=1;
    
    
    
    public clinicProvider(String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber);
        this.clinicproviderId="clinicproviderId_"+this.clinicproviderCounter;
        clinicproviderCounter++;
        
    }

    public String getClinicproviderId() {
        return clinicproviderId;
    }

    public void setClinicproviderId(String clinicproviderId) {
        this.clinicproviderId = clinicproviderId;
    }
    
    
}
