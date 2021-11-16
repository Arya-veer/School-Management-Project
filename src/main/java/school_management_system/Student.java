/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_management_system;

import java.util.*;
import java.sql.Date;

import javax.swing.JOptionPane;
import static school_management_system.HashMapHandler.*;

/**
 *
 * @author arya_veer
 */
public class Student extends User{
    
    HashMap<String,Integer> stdcourses = new HashMap<>();
    
    private final static String filepath = "./src/main/java/school_management_system/files/Student.txt";
    private static HashMap<String,ArrayList<String>> map = getfromFile(filepath);
    ArrayList<String> courselist = new ArrayList<>();
    private int std;
 
    Student(UUID uuid,String username,String password,Date birthDate,int std, 
            char sex,String address,String email,ArrayList<String> courselist,int attendence){
            
        super(uuid,username, email, password, birthDate, sex, address,attendence);   
            
        
        //initalization of Hashmap
        //If entry exists then initalize to that entry
        //Otherwise set all marks to zero
   
        //for(int i = 0 ;i < courselist.size() ;i++){
        //    stdcourses.put(courselist.get(i),0);
        //    }
        
        //Save Hashmap
    
        this.courselist = courselist;        
        
        if (std < 1 || std > 12){
            JOptionPane.showMessageDialog(null, "Invalid Class");
        } 
        else{this.std = std;}
    } 

    Student(UUID uuid){
        super(uuid);
        
        this.uniqueID = uuid;
        
        ArrayList<String> attrib = map.get(uuid.toString());
        
        username = attrib.get(0);
        password = attrib.get(1);
        birthDate = Date.valueOf(attrib.get(2));
        std = Integer.parseInt(attrib.get(3));
        sex = attrib.get(4).charAt(0);
        address = attrib.get(5);
        email = attrib.get(6);
        courselist.addAll(Arrays.asList(attrib.get(7).split(",")));
        attendence = Integer.parseInt(attrib.get(8));     

    }
    //Getters
    
    public int getStd() {
        return std;
    }
    
    public ArrayList<String> getStdCourses(){
        return courselist;
    }
    
    public int getAttendence() {
        return attendence;
    }
    
    public static HashMap<String,ArrayList<String>> getStudList(){
        return map;
    }
    
    //Setters
    public void setStd(int std) {
        this.std = std;
    }
    
    public void setUUID(UUID uuid){
        this.uniqueID = uuid;
    }
    
    public void gradeCourse(String cid, int marks){
        stdcourses.replace(cid,marks);
    }
    
    //Make attribute list
    private ArrayList<String> makeStudList(){
        ArrayList<String> attrib = new ArrayList<>();
        
        attrib.add(username);
        attrib.add(password);
        attrib.add(String.valueOf(birthDate));
        attrib.add(Integer.toString(std));
        attrib.add(String.valueOf(sex));
        attrib.add(address);
        attrib.add(email);
        
        attrib.add(courselist.toString().substring
        (1,courselist.toString().length()-1).replaceAll(" ", ""));
        
        attrib.add(Integer.toString(attendence));
        
        return attrib;
    }
    
    //Checks if Student already exists
    public boolean inStudList(){
        return map.containsKey(uniqueID.toString()) ? true:false;
    }

    //Replace student
    public void replaceStud(String uniqueID){
        ArrayList<String> attrib = makeStudList();
        map.replace(uniqueID, attrib);
    }
   
    //Saves the student in HashMap
    
    public void saveStud(){
        ArrayList<String> attrib = makeStudList();
        map.put(uniqueID.toString(),attrib);
    }
    
    //Save the Hashmap
    
    public static void closeStudFile(){
        saveToFile(map,filepath);
    }
}
