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
public class FinanceAdmin extends Person {
    
    public static int finCounter = 1;
    private String financeAdminId;
    
    public FinanceAdmin(String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber);
        financeAdminId = "financeAdmin_"+finCounter;
        finCounter++;
    }

    public String getFinanceAdminId() {
        return financeAdminId;
    }
    
}
