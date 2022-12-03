/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Person.Person;
import java.util.Date;

/**
 *
 * @author sreej
 */
public class ClinicAdmin extends Person{
    
    private String clinicId;
    private static int vidCounter = 1;
    public ClinicAdmin(String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber) {
        
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber);
        this.clinicId = "ca_"+this.vidCounter+1;
        this.vidCounter++;
        
    }

    public String getClinicId() {
        return clinicId;
    }

    

    
    
}
