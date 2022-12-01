/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import java.util.*;

/**
 *
 * @author sujithkaluva
 */
public class Person {
    
    public static int personCounter = 1;
    private String personId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String emailId;
    private String gender;
    private long phoneNumber;

    public Person(String personId, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber) {
        this.personId = "person_"+this.personCounter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.emailId = emailId;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.personCounter++;
    }

    public static int getPersonCounter() {
        return personCounter;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
}