/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Role.Volunteer;
import java.util.ArrayList;

/**
 *
 * @author sreej
 */
public class VolunteerDirectory {
    private ArrayList<Volunteer> volunteerDirectory;

    public VolunteerDirectory() {
        this.volunteerDirectory = new ArrayList<>();
    }

    public ArrayList<Volunteer> getVolunteerDirectory() {
        return volunteerDirectory;
    }

    public void setVolunteerDirectory(ArrayList<Volunteer> volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
    }
    
    
}
