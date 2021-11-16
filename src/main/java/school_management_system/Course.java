/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_management_system;

import java.util.*;
import static school_management_system.HashMapHandler.*;

/**
 *
 * @author arya_veer
 */
public class Course{
    private String courseName;
    private String courseID;
    private int maxMarks;
    private String desc;
    
    private final static String filepath = "./src/main/java/school_management_system/files/Courses.txt";
    
    private static HashMap<String,ArrayList<String>> map = getfromFile(filepath);
    
    public Course(String courseID){
        ArrayList<String> attrib = map.get(courseID);
        
       courseName = attrib.get(0);
       this.courseID = courseID;
       maxMarks = Integer.parseInt(attrib.get(1));
       desc = attrib.get(0);
        
    }

    public Course(String courseName, String courseID, int maxMarks, String desc){
        this.courseName = courseName;
        this.courseID = courseID;
        this.maxMarks = maxMarks;
        this.desc = desc;
    }
    
    // Getters
    
    public String getCourseName(){
        return courseName;
    }
    public String getCourseID(){
        return courseID;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public String getDesc(){
        return desc;
    }

    public static HashMap<String,ArrayList<String>> getCourseList(){
        return map;
    }
    
    //Setters
    
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public void setCourseID(String courseID){
        this.courseID = courseID;
    }
    public void setMaxMarks(int maxMarks){
        this.maxMarks = maxMarks;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }    
    
    //Make attribute list
    private ArrayList<String> makeCourseList(){
        ArrayList<String> attrib = new ArrayList<>();
        
        attrib.add(courseName);
        attrib.add(Integer.toString(maxMarks));
        attrib.add(desc);
        
        return attrib;
    }

    //Checks if course already exists
    public boolean inCourseList(){
        return map.containsKey(courseID) ? true:false;
    }
    
    //Replace course
    public void replaceCourse(String CourseID){
        ArrayList<String> attrib = makeCourseList();
        map.replace(CourseID, attrib);
    }
    
    //Saves the course in HashMap
    
    public void saveCourse(){
        ArrayList<String> attrib = makeCourseList();
        map.put(courseID,attrib);
    }
    
    //Save the Hashmap
    
    public static void closeCourseFile(){
        saveToFile(map,filepath);
    }
}

