/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PasswordEncryption;

import java.util.HashMap;

/**
 *
 * @author sreej
 */
public class PasswordManager {
    HashMap<String,HashMap<String,String>> passwordManager;

    public PasswordManager() {
        this.passwordManager = new HashMap<>();
    }

    public HashMap<String, HashMap<String, String>> getPasswordManager() {
        return passwordManager;
    }

    public void setPasswordManager(HashMap<String, HashMap<String, String>> passwordManager) {
        this.passwordManager = passwordManager;
    }
    
    
    
}
