/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.enterprise;

import Business.Ecosystem.Ecosystem;
import java.util.Date;

/**
 *
 * @author tendusmac
 */
public class Enterprise {
    
    private String companyName;
    private Date companyEstDate;
    private String address;
    Ecosystem ecoSystem=Ecosystem.getInstance();

    public Enterprise(String companyName, Date companyEstDate, String address) {
        this.companyName = companyName;
        this.companyEstDate = companyEstDate;
        this.address = address;
        ecoSystem.getEnterpriseDirectory().getEnterprisedirectory().add(this);
        
        
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getCompanyEstDate() {
        return companyEstDate;
    }

    public void setCompanyEstDate(Date companyEstDate) {
        this.companyEstDate = companyEstDate;
    }
    
    
}
