/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.enterprise;

/**
 *
 * @author tendusmac
 */
public class Enterprise {
    
    private String companyName;
    private String companyEstDate;

    public Enterprise(String companyName, String companyEstDate) {
        this.companyName = companyName;
        this.companyEstDate = companyEstDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyEstDate() {
        return companyEstDate;
    }

    public void setCompanyEstDate(String companyEstDate) {
        this.companyEstDate = companyEstDate;
    }
    
    
}
