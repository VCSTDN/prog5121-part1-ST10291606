/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

/**
 *
 * @author Aron McDonald
 */
public class Account {
    
    //Variables for the Account class are declared 
    String name;
    String surname;
    String username;
    String password;
    
    
    // set methods for all declared variables
    public void setname(String nameInput){
        this.name = nameInput;
    }
    
    public void setsurname(String surnameInput){
        this.surname = surnameInput;
    }
    
    public void setusername(String usernameInput){
        this.username = usernameInput;
    }
    
    public void setpassword(String passwordInput){
        this.password = passwordInput;
    }
    
    // get methods for all the declared variables 
    public String getname(){
        return this.name; 
    
    }
    
    public String getsurname(){
        return this.surname; 
    
    }
    
    public String getusername(){
        return this.username; 
    
    }
    
    public String getpassword(){
        return this.password; 
    
    }
}
