/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe;

/**
 *
 * @author Aron McDonald
 */

import java.util.Scanner; // allows for the user of scanners in the application
import java.util.regex.Matcher; // allows for the matcher class to be used in regular expressions (w3schools.com/2023)
import java.util.regex.Pattern; // allows for the pattern class to be used in regular expressions (w3schools.com/2023)


public class Kankanboard {
    
   
    
    public static Account account = new Account(); // Creating a new object of the Account class to store the name, surname, username and passcode
   
    /* Declaring all the neccessary variables to be used within the application and making them public so that they
    can be accesed by all methods and classes */ 
    public static String accname;
    public static String accsurname;
    public static String accusername;
    public static String accpassword;
    public static String inusername;
    public static String inpassword;

    public static void main(String[] args) {
        
        // While loop created to allow user to create an account, login or exit the application
        while (true) { 
            System.out.println("Choose an option:");
            System.out.println("1 - Create an account");
            System.out.println("2 - Login into an account");            
            System.out.println("3 - Quit");
            
            Scanner input = new Scanner(System.in); // Declaring a new scanner to recieve user input
            int choice = input.nextInt(); 

            if (choice == 1) {
                System.out.println("What is your name? ");
                input.nextLine(); // takes the user next input so as to not record wrong input as answer to the next questions
                accname = input.nextLine(); // stores the accname as the users input
               
                
                System.out.println("What is your surname? ");
                accsurname = input.nextLine(); // stores accsurname as the users input
                
                System.out.println("Please enter a username");
                System.out.println("Your username must contain an underscore and be under 5 characters long ");
                accusername = input.nextLine(); // stors the accusername as the users input
                
                // boolean declared that is initialized as the return of the checkUsername method to determine if the username meets all requirements
                boolean validUsername = checkUsername(accusername); 
                
                // while loop that if validUsername boolean returns as false keeps insisting the user to input a viable username 
                while (!validUsername){
                    System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
                    accusername = input.nextLine(); // new input is stored as the new username for the account
                    validUsername = checkUsername(accusername); // method called again to check if new username is valid
                
                }
                
                
                System.out.println("Please enter a password");
                System.out.println("Your password must contain at least 8 characters, a capital letter, a number and a special character ");
                accpassword = input.nextLine(); // password stored as the users input
                
                // boolean declared that is initialized as the return of the checkPassword method to determine if the password meets all requirements
                boolean validPassword = checkPassword(accpassword);
                
                // while loop that if validPassword boolean returns as false keeps insisting the user to input a viable username 
                while (!validPassword){
                    System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character. ");
                    accpassword = input.nextLine(); // new passowrd is stored as the users next input
                    validPassword = checkPassword(accpassword); // method called again to check if new password is valid
                
                }
                
                System.out.println(registerUser()); // register user method is called
                
       
               
            } else if (choice == 2) {
                
                System.out.println("Enter your username: ");
                Scanner input1 = new Scanner(System.in); // new scanner declared to take input for login username
                inusername = input1.nextLine();
                System.out.println("Enter you password: ");
                Scanner input2= new Scanner(System.in); // new scanner declared to take input for login passworf
                inpassword = input2.nextLine();
                
                loginUser(); // login user method called
                
  
            } else if (choice == 3) {
                break; // this statement breaks the while loop and therefore the application ends
            } else {
                System.out.println("Invalid choice"); // only inputs 1, 2, and 3 are accepted by the loop all other input results in an invalid choice
            }
        }
    }
    
    // boolean method that returns either true or false depending on if the username its reading contains an underscore and is less than 5 characters in length
    public static boolean checkUsername(String accusername) {
        return accusername.contains("_") && accusername.length() < 6; // .contains allows us determine if a string has a certain character while .length determines the length of a certain string
    }
    
    // boolean method that returns either true or flase depending on if the given password meets the required standards
    public static boolean checkPassword(String accpassword) {
        //A regular expression is a sequence of characters that forms a search pattern. When you search for data in a text, you can use this search pattern to describe what you are searching for.
        //This regular expression helps to determine if their are special characters, capital letters and the string has at least 8 characters
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$");
        Matcher matcher = pattern.matcher(accpassword);
        return matcher.matches();
    }
    
    // method that returns true or false depending on if the submitted username and password match the stored information
    public static boolean loginUser() {
       
        
        if(account.getusername().equals(inusername) && account.getpassword().equals(inpassword)){
            System.out.println("Welcome back " + account.getname() + " " + account.getsurname() + " it is great to see you again.");
            return true;
      
        }
        
        System.out.println("Username or password incorrect, please try again.");
        return false;
               
    }
    
    // method to store all given data to the Account class as attributes of that class and thus create a new account for the user
    public static String registerUser(){
     
        account.setname(accname);
        account.setsurname(accsurname);
        account.setusername(accusername);
        account.setpassword(accpassword);
        
        String register = "Your account has been created ";
        
        return register;
        
    }
        
} 
     