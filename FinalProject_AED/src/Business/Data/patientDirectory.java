/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Data;

import Business.Ecosystem.Ecosystem;
import Business.Role.Patient;
import java.util.ArrayList;

/**
 *
 * @author tendusmac
 */
public class patientDirectory {

    private ArrayList<Patient> patientdirectory;
//    Ecosystem ecosystem = Ecosystem.getInstance();

    public patientDirectory() {
        this.patientdirectory = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientdirectory() {
        return patientdirectory;
    }

    public void setPatientdirectory(ArrayList<Patient> patientdirectory) {
        this.patientdirectory = patientdirectory;
    }
    
    public void addPatient(Patient pObj){
        this.patientdirectory.add(pObj);
    }
    
//    public boolean isUsernameAvailable(String username,String Role){
//        System.out.print(Role+"--"+username);
//        return !ecosystem.getPasswordManager().getPasswordManager().get(Role).containsKey(username);
//    }

}
