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
public class EnterpriseAdmin extends Person{
    
    public static int entAdminCounter = 1;
    private String entAdminId;
    
    public EnterpriseAdmin(String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber);
        entAdminId = "entAdmin_" + entAdminCounter;
        entAdminCounter++;
    }

    public String getEntAdminId() {
        return entAdminId;
    }
     
}
