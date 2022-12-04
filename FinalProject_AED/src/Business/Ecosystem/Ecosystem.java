/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Ecosystem;
import Business.Data.*;

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

    public  Ecosystem(){
    
        clinicAdminDirectory=new ClinicAdminDirectory();
        enterpriseDirectory=new EnterpriseDirectory();
        salesPersonDirectory=new SalesPersonDirectory();
        vaccineDirectory=new VaccineDirectory();
        volunteerDirectory=new VolunteerDirectory();
        clinicdirectory=new clinicDirectory();
        clinicofficerdirectory=new clinicOfficerDirectory();
        diseasedirectory=new diseaseDirectory();
        patientdirectory=new patientDirectory();
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
