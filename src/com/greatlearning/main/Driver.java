package com.greatlearning.main;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

import java.util.Scanner;

public class Driver {
    private static Scanner input = new Scanner(System.in);
    private static CredentialService cs = new CredentialService();

    public static void main(String[] args) {
        String firstName , lastName , department;
        Employee emp;
        System.out.println(" First Name : ");
        firstName = input.next();

        System.out.println(" Last Name : ");
        lastName = input.next();

        department = getDepartment();
        if(department != "") {
            emp = new Employee(firstName, lastName, department);

            String emailAddress = cs.generateEmailAddress(emp);
            String password = cs.generatePassword();
            cs.showCredentials(emp,emailAddress,password);
        }
    }

    private static String getDepartment(){
        System.out.println("Choose your department");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resources");
        System.out.println("4. Legal");
        System.out.println("--------------------------------");

        int choice;
        String dept="";

        System.out.println(" Enter your choice : ");
        choice = input.nextInt();
        switch (choice){
            case 1 :
                dept = "tech";
                break;

            case 2 :
                dept = "adm";
                break;

            case 3 :
                dept = "hr";
                break;

            case 4 :
                dept = "lg";
                break;
            default:
                System.out.println("Wrong Choice!!");

        }
        return dept;
    }
}
