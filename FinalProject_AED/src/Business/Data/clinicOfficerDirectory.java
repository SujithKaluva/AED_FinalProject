/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Role.clinicOfficer;
import java.util.ArrayList;

/**
 *
 * @author tendusmac
 */
public class clinicOfficerDirectory {
    private ArrayList<clinicOfficer> clinicofficerdirectory;

    public clinicOfficerDirectory(ArrayList<clinicOfficer> clinicofficerdirectory) {
        this.clinicofficerdirectory = clinicofficerdirectory;
    }

    public ArrayList<clinicOfficer> getClinicofficerdirectory() {
        return clinicofficerdirectory;
    }

    public void setClinicofficerdirectory(ArrayList<clinicOfficer> clinicofficerdirectory) {
        this.clinicofficerdirectory = clinicofficerdirectory;
    }
    
    
}
