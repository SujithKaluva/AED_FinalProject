/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Role.SalesPerson;
import java.util.ArrayList;

/**
 *
 * @author sreej
 */
public class SalesPersonDirectory {
    
    private ArrayList<SalesPerson> salesPersonDirectory;

    public SalesPersonDirectory(ArrayList<SalesPerson> salesPersonDirectory) {
        this.salesPersonDirectory = salesPersonDirectory;
    }

    public ArrayList<SalesPerson> getSalesPersonDirectory() {
        return salesPersonDirectory;
    }

    public void setSalesPersonDirectory(ArrayList<SalesPerson> salesPersonDirectory) {
        this.salesPersonDirectory = salesPersonDirectory;
    }
    
    
    
}
