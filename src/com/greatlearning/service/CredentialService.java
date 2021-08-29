package com.greatlearning.service;
import com.greatlearning.model.Employee;

import java.util.Random;

public class CredentialService {
    public String generateEmailAddress(Employee emp){
        String emailAddress;
        emailAddress = emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() + "@" + emp.getDepartment() + ".abc.com";
        return emailAddress;
    }

    public String generatePassword(){
        Random random = new Random();
        String allowedChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=?";
        char[] password = new char[8];
        for(int i=0; i<8; i++){
             int index = random.nextInt(allowedChar.length());
             password[i] = allowedChar.charAt(index);
        }
        return new String( password);
    }

    public void showCredentials(Employee emp , String email , String password){
        System.out.println("Dear " + emp.getFirstName() + " your generated credentials are as follows");
        System.out.println("Email --> "+email);
        System.out.println("Password --> "+password);

    }
}
