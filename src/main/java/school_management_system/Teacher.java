/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_management_system;

import java.sql.*;
import java.util.*;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;
import static school_management_system.HashMapHandler.*;

/**
 *
 * @author arya_veer
 */
public class Teacher extends User{
    private String courseID;
    private double salary;
    ArrayList<Integer> standards = new ArrayList<>();
    private final static String filepath = "./src/main/java/school_management_system/files/Teacher.txt";
    private static HashMap<String,ArrayList<String>> map = getfromFile(filepath);
    
    Teacher(UUID uuid,String username,String password,java.sql.Date birthDate,char sex, 
            String address,String email,String courseID,
            ArrayList<Integer> standards,double salary,int attendence){
        
        super(uuid,username,email,password,birthDate,sex, address,attendence);
        this.courseID = courseID;
        this.salary = salary;
        this.standards = standards;
    }
    
    Teacher(UUID uuid){
        super(uuid);
        
        this.uniqueID = uuid;
        
        ArrayList<String> attrib = map.get(uuid.toString());
        
        username = attrib.get(0);
        password = attrib.get(1);
        birthDate = java.sql.Date.valueOf(attrib.get(2));
        sex = attrib.get(3).charAt(0);
        address = attrib.get(4);
        email = attrib.get(5);
        courseID = attrib.get(6);
        
        standards.addAll(Arrays.stream(StringtoInt
        (attrib.get(7).split(","))).boxed().collect(Collectors.toList()));
        
        salary = Double.parseDouble(attrib.get(8));
        attendence = Integer.parseInt(attrib.get(9));     

    }
    
    //Getters
    public String getCourseID(){
        return courseID;
    }
    
    public Double getSalary(){
        return salary;
    }

    public ArrayList<Integer> getStdList(){
        return standards;
    }
    
    public int getAttendence() {
        return attendence;
    }
    
    //Setters
    
    public void setCourseID(Course course){
        this.courseID = courseID;
    }
    
    public void setSalary(Double salary){
        this.salary = salary;
    }

    public void setStdList(ArrayList<Integer> standards){
        this.standards = standards;
    }
    
    public static HashMap<String,ArrayList<String>> getTeacherList(){
        return map;
    }
    
    //Other methods
    
    
   public int[] StringtoInt(String args[]) {
      int size = args.length;
      int [] arr = new int [size];
      for(int i=0; i<size; i++) {
         arr[i] = Integer.parseInt(args[i]);
      }
      return arr;
   }
    
    
    public void assignStandard(int i){
        if(standards.contains(i)){
            JOptionPane.showMessageDialog(null, "Invalid Standard");
        }
        else{
            standards.add(i);
        }
    }
    
   public void giveMarks(Student s,int marks){
       if((standards.contains(s.getStd()))  && (s.stdcourses.containsKey(courseID))){
           s.gradeCourse(courseID, marks);
        }
       else{
           JOptionPane.showMessageDialog(null, "Invalid action");
        }
    }
   
   //Make attribute list
    private ArrayList<String> makeTeacherList(){
        ArrayList<String> attrib = new ArrayList<>();
        
        attrib.add(username);
        attrib.add(password);
        attrib.add(String.valueOf(birthDate));
        attrib.add(String.valueOf(sex));
        attrib.add(address);
        attrib.add(email);
        attrib.add(courseID);
        
        attrib.add(standards.toString().substring
        (1,standards.toString().length()-1).replaceAll(" ", ""));
        
        attrib.add(Double.toString(salary));
        attrib.add(Integer.toString(attendence));
        
        return attrib;
    }
    
    
    //Checks if Teacher already exists
    public boolean inTeacherList(){
        return map.containsKey(uniqueID.toString()) ? true:false;
    }

    //Replace teacher
    public void replaceTeacher(String uniqueID){
        ArrayList<String> attrib = makeTeacherList();
        map.replace(uniqueID, attrib);
    }
   
    //Saves the teacher in HashMap
    
    public void saveTeacher(){
        ArrayList<String> attrib = makeTeacherList();
        map.put(uniqueID.toString(),attrib);
    }
    
    //Save the Hashmap
    
    public static void closeTeacherFile(){
        saveToFile(map,filepath);
    }
 
    public static ArrayList<Integer> getStdNo(String[] stdstr){
    
    ArrayList<Integer> stdNo = new ArrayList<>();
    
    for(int i = 0;i<stdstr.length;i++){
        int std = 0;
        
        switch(stdstr[i]){
            case "I"   : std= 1; break; 
            case "II"  : std= 2; break;
            case "III" : std= 3; break; 
            case "IV"  : std= 4; break;
            case "V"   : std= 5; break;
            case "VI"  : std= 6; break;
            case "VII" : std= 7; break; 
            case "VIII": std= 8; break;       
            case "IX"  : std= 9; break;  
            case "X"   : std= 10;break; 
            case "XI"  : std= 11;break; 
            case "XII" : std= 12;break;   
            default : System.out.println("Invalid Grade");   
        }
        
        stdNo.add(std);    
    }
    
    return stdNo;
}   
   
    public static String  convertStd(int std){
   
        String str = "";
        
        switch(std){
            case 1 : str = "I"   ;break; 
            case 2 : str = "II"  ;break;
            case 3 : str = "III" ;break; 
            case 4 : str = "IV"  ;break;
            case 5 : str = "V"   ;break;
            case 6 : str = "VI"  ;break;
            case 7 : str = "VII" ;break; 
            case 8 : str = "VIII";break;       
            case 9 : str = "IX"  ;break;  
            case 10: str = "X"   ;break; 
            case 11: str = "XI"  ;break; 
            case 12: str = "XII" ;break;   
            default : System.out.println("Invalid Grade");   
        }
        return str;
    }   
}