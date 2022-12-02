/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Person.Person;
import java.util.Date;

/**
 *
 * @author sujithkaluva
 */
public class ResearchScientist extends Person{
    
    public static int sciCounter = 1;
    private String reaserchScientistId;
    
    public ResearchScientist(String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber);
        reaserchScientistId = "reaserchScientist_"+sciCounter;
        sciCounter++;
    }

    public String getReaserchScientistId() {
        return reaserchScientistId;
    }
    
}
