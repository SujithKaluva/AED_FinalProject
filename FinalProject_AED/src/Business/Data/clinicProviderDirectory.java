/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Role.clinicProvider;
import java.util.ArrayList;

/**
 *
 * @author tendusmac
 */
public class clinicProviderDirectory {
    
    private ArrayList<clinicProvider> clinicproviderdirectory;

    public clinicProviderDirectory(ArrayList<clinicProvider> clinicproviderdirectory) {
        this.clinicproviderdirectory = clinicproviderdirectory;
    }

    public ArrayList<clinicProvider> getClinicproviderdirectory() {
        return clinicproviderdirectory;
    }

    public void setClinicproviderdirectory(ArrayList<clinicProvider> clinicproviderdirectory) {
        this.clinicproviderdirectory = clinicproviderdirectory;
    }
    
    
    
}
