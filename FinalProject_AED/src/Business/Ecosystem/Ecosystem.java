/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Ecosystem;

import Business.Data.*;
import PasswordEncryption.PasswordManager;

/**
 *
 * @author tendusmac
 */
public class Ecosystem {

    public static Ecosystem system;
    public ClinicAdminDirectory clinicAdminDirectory;
    public EnterpriseDirectory enterpriseDirectory;
    public SalesPersonDirectory salesPersonDirectory;
    public VaccineDirectory vaccineDirectory;
    public VolunteerDirectory volunteerDirectory;
    public clinicDirectory clinicdirectory;
    public clinicOfficerDirectory clinicofficerdirectory;
    public diseaseDirectory diseasedirectory;
    public patientDirectory patientdirectory;
    public PasswordManager passwordManager;

    public Ecosystem() {

        clinicAdminDirectory = new ClinicAdminDirectory();
        enterpriseDirectory = new EnterpriseDirectory();
        salesPersonDirectory = new SalesPersonDirectory();
        vaccineDirectory = new VaccineDirectory();
        volunteerDirectory = new VolunteerDirectory();
        clinicdirectory = new clinicDirectory();
        clinicofficerdirectory = new clinicOfficerDirectory();
        diseasedirectory = new diseaseDirectory();
        patientdirectory = new patientDirectory();
        passwordManager = new PasswordManager();
    
    }

    public static Ecosystem getSystem() {
        return system;
    }

    public ClinicAdminDirectory getClinicAdminDirectory() {
        return clinicAdminDirectory;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public SalesPersonDirectory getSalesPersonDirectory() {
        return salesPersonDirectory;
    }

    public VaccineDirectory getVaccineDirectory() {
        return vaccineDirectory;
    }

    public VolunteerDirectory getVolunteerDirectory() {
        return volunteerDirectory;
    }

    public clinicDirectory getClinicdirectory() {
        return clinicdirectory;
    }

    public clinicOfficerDirectory getClinicofficerdirectory() {
        return clinicofficerdirectory;
    }

    public diseaseDirectory getDiseasedirectory() {
        return diseasedirectory;
    }

    public patientDirectory getPatientdirectory() {
        return patientdirectory;
    }

    public PasswordManager getPasswordManager() {
        return passwordManager;
    }

    public static Ecosystem getInstance() {
        if (system == null) {
            system = new Ecosystem();
            //system.Configure();
            return system;
        }
        return system;
    }

    public static void setInstance(Ecosystem sys) {
        system = sys;
    }

}
