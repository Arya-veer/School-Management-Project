/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_management_system;
import java.awt.image.BufferedImage;
import java.util.UUID;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author arya_veer
 */

public abstract class User {
    protected String username;
    protected UUID uniqueID;
    protected BufferedImage img;
    protected String password;
    protected Date birthDate;
    protected String email;  
    protected float salary;
    protected char sex;
    protected String address;
    protected int attendence;
    
    User(UUID uuid,String username,String email,String password,
            Date birthDate, char sex, String address,int attendence){
        this.birthDate = birthDate;
        this.username = username;
        this.email = email;
        this.password = password;
        this.uniqueID = UUID.randomUUID(); 
        this.sex = sex;
        this.address = address;
        this.uniqueID = uuid;
        this.attendence = attendence;
    }
    
    User(UUID uuid){
        
    }
    
    // Image will be sorted later
    
    //Getters
    
    public UUID getUUID(){
        return uniqueID;
    }
    
    public String getUsername(){
        return username;
    }
    
     public String getPass(){
        return password;
    }
    
    public Date getBDay(){
        return birthDate;
    }

    public char getSex(){
        return sex;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getEmail(){
        return email;
    }
    
    //Setters
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPass(String password){
        this.password = password;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    public void forgetPassword(String username){
        // if user exists then send the new password through mail
    }
    public void changePassword(String username, String Password, String newPassword){
        if(this.username.equals(username) && this.password.equals(password)){
            this.password = newPassword;
        }
        else{
            JOptionPane.showMessageDialog(null,"Kindly check your username or password");
        }
    }

    public static boolean adminAuthorization(String username,String password){
        if((username.equals("admin")) && (password.equals("admin123"))){
            return true;
            }
        else{
            return false;
        }    
    }
    
    
    /* create getter and setter for all except UUID 
    Make getter for UUID
    */
//    public static boolean login(String username, String Password){
////        if(this.username.equals(username) && this.password.equals(password)){
////            // Jform.setVisible() = true;
////            return true;
////        }
////        else{
////            JOptionPane.showMessageDialog(null,"Kindly check your username or password");
////            return false;
////        }
//    }
    
    public void markAttendence(){
        attendence++;
    }

    // logout method
    
}
