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
public class salesAdmin extends Person {
    
    private String salesAdminId;
    private static int salesAdminCounter=1;
    
    public salesAdmin(String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber);
        
        this.salesAdminId="salesAdmin_"+this.salesAdminCounter;
        salesAdminCounter++;
        
        
        
    }

    public String getSalesAdminId() {
        return salesAdminId;
    }

    public void setSalesAdminId(String salesAdminId) {
        this.salesAdminId = salesAdminId;
    }
    
    
    
    
}
