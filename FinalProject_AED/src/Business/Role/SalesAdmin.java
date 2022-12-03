/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.Person.Person;
import java.util.*;

/**
 *
 * @author sujithkaluva
 */
public class SalesAdmin extends Person {
    
    private String salesAdminId;
    public int counter = 1;
    
    public SalesAdmin(String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber);
        this.salesAdminId = "salesAdmin"+counter;
        counter++;
    }
    
}
