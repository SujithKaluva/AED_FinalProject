/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Ecosystem;

import Business.Manufacturer.Manufacturer;
import Business.Role.Patient;
import Business.Role.SalesPerson;
import Business.Role.Volunteer;
import PasswordEncryption.PasswordEncryption;
import java.util.Date;

/**
 *
 * @author sujithkaluva
 */
public class ConfigureSystem {
    
    public static Ecosystem configure(){
        Ecosystem system = Ecosystem.getInstance();
        Date d = new Date();
        Patient pObj = new Patient("Sujith","Sujith","Kaluva",d,"sujith@gmail.com","Male",8572458702l,"42.3398067,-71.0913604");
        Manufacturer f=null;
        //String password, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber, Manufacturer manufacturer, String location
        SalesPerson j=new SalesPerson("sr","Sujith","Kaluva",d,"sr@gmail.com","Male",8572458702l,f,"42.3398067,-71.0913604");
        //Volunteer vObj = new Volunteer("password", "Volunteer", "One", d, "sujithkaluva25@gmail.com", "Male", 8572458702l);
        return system;
    }
}
