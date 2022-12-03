/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Manufacturer;

import Business.Data.VaccineDirectory;

/**
 *
 * @author sreej
 */

public class Manufacturer {
    VaccineDirectory vaccinelist;

    public Manufacturer(VaccineDirectory vaccinelist) {
        this.vaccinelist = vaccinelist;
    }

    public VaccineDirectory getVaccinelist() {
        return vaccinelist;
    }

    public void setVaccinelist(VaccineDirectory vaccinelist) {
        this.vaccinelist = vaccinelist;
    }
    
}
