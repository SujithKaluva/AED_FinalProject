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
public class SalesPerson extends Person{
    
    String status;
    Date date;
    Date deliveredDate;
    String comments;
    private String salesId;
    private static int vidCounter = 1;

    public SalesPerson(String status, Date date, Date deliveredDate, String comments, String firstName, String lastName, Date dateOfBirth, String emailId, String gender, long phoneNumber) {
        super(firstName, lastName, dateOfBirth, emailId, gender, phoneNumber);
        this.status = status;
        this.date = date;
        this.deliveredDate = deliveredDate;
        this.comments = comments;
         this.salesId = "s_"+this.vidCounter+1;
        this.vidCounter++;
    }
    
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDeliveredDate() {
        return deliveredDate;
    }

    public void setDeliveredDate(Date deliveredDate) {
        this.deliveredDate = deliveredDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    
    
}
