package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        //Create Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        //Prompt user for first name
        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();         //trim removes extra spaces

        //Prompt user for middle name (optional)
        System.out.print("Middle name: ");
        String middleName = scanner.nextLine().trim();

        //Prompt user for last name
        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();

        //Prompt user for suffix (optional)
        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        //Start building the full name with first and last name
        String fullName = firstName;

        //Add middle name only if user entered something
        if(!middleName.isEmpty()){
            fullName += " " + middleName;

        }
        //Always add last name
        fullName += " " + lastName;

        //Add suffix only if user entered something
        if (!suffix.isEmpty()){
            fullName +=", " + suffix;                //Comma before suffix
        }
        // Print the final result
        System.out.println("Full name: " + fullName);

        //Close scanner
        scanner.close();
    }
}
