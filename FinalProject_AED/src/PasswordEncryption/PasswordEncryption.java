/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PasswordEncryption;
import java.math.BigInteger;  
import java.nio.charset.StandardCharsets;  
import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException;
/**
 *
 * @author sujithkaluva
 */
public class PasswordEncryption {
    
    public byte[] getSHA(String input) throws NoSuchAlgorithmException{  
        /* MessageDigest instance for hashing using SHA512*/  
        MessageDigest md = MessageDigest.getInstance("SHA-512");  
  
        /* digest() method called to calculate message digest of an input and return array of byte */  
        return md.digest(input.getBytes(StandardCharsets.UTF_8));  
    }  
      
    public String toHexString(byte[] hash){  
        /* Convert byte array of hash into digest */  
        BigInteger number = new BigInteger(1, hash);  
  
        /* Convert the digest into hex value */  
        StringBuilder hexString = new StringBuilder(number.toString(16));  
  
        /* Pad with leading zeros */  
        while (hexString.length() < 32)  
        {  
            hexString.insert(0, '0');  
        }  
  
        return hexString.toString();  
    }  
    
    public String getEncryptedPassword(String plainPassword){
        try {
            return toHexString(getSHA(plainPassword));
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Exception thrown for incorrect algorithm: " + ex);
            return null;
        }
    }
    
    public boolean matchPassword(String savedPassword, String enteredPassword){
        try {
            return savedPassword.equals(toHexString(getSHA(enteredPassword)));
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Exception thrown for incorrect algorithm: " + ex);
            return false;
        }
    }
}
