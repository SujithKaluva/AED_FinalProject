/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Role.ClinicAdmin;
import java.util.ArrayList;

/**
 *
 * @author sreej
 */
public class ClinicAdminDirectory {
    private ArrayList<ClinicAdmin> ClinicAdminDirectory;

    public ClinicAdminDirectory(ArrayList<ClinicAdmin> ClinicAdminDirectory) {
        this.ClinicAdminDirectory = ClinicAdminDirectory;
    }

    public ArrayList<ClinicAdmin> getClinicAdminDirectory() {
        return ClinicAdminDirectory;
    }

    public void setClinicAdminDirectory(ArrayList<ClinicAdmin> ClinicAdminDirectory) {
        this.ClinicAdminDirectory = ClinicAdminDirectory;
    }
    
    
}
