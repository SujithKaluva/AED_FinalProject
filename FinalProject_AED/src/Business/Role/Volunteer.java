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
public class Volunteer extends Person{

    private String volunteerId;
    private static int vidCounter = 1;
    public Volunteer(String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber) {
        
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber);
        this.volunteerId = "v_"+this.vidCounter+1;
        this.vidCounter++;
        
    }

    public String getVolunteerId() {
        return volunteerId;
    }

   
    
 
    
}
