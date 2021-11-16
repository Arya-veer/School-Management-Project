package school_management_system;

import java.util.ArrayList;
import java.io.*;
import java.sql.Date;
import java.util.UUID;
import static school_management_system.Teacher.*;


public class UserFileHandler {

    // Cannot Handle Files with zero entries
    
  
    public static void setCourseList(ArrayList<Course> courselist){
        
        try{
               String filePath = "./src/main/java/school_management_system/files/Courses.txt";
               File file = new File(filePath);
               
               //If the file doesn't exist create one
               if(!file.exists()){
                   file.createNewFile();
               }
               
               FileWriter fw = new FileWriter(file.getAbsoluteFile());
               BufferedWriter bw = new BufferedWriter(fw);
               
               //loop for Courses
               for(int i = 0; i < courselist.size(); i++){
                   
                   bw.write(courselist.get(i).getCourseName());
                   bw.write("@");
                   bw.write(courselist.get(i).getCourseID());
                   bw.write("@");
                   bw.write(Integer.toString(courselist.get(i).getMaxMarks()));
                   bw.write("@");
                   bw.write(courselist.get(i).getDesc());
                   bw.write("@");
                    
                   //break line at the end 
                   bw.write("\n");
               }
               bw.close(); 
               fw.close();
               
               }catch(Exception ex){
                   ex.printStackTrace();
               }
           }
    
    public static ArrayList<Student> getStudentList(){
        ArrayList<Student> studlist = new ArrayList<>();
        String filePath = "./src/main/java/school_management_system/files/Student.txt";
        File file = new File(filePath);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            Object[] lines = br.lines().toArray();

            for(int i = 0; i < lines.length; i++)
            {
                String line = lines[i].toString().trim();
                String[] dataRow = line.split("=");  
            
            String stdcourselist = dataRow[8];
            String[] CourseIDs =stdcourselist.split(",");
            
            ArrayList<Course> clist = new ArrayList<>();
            ArrayList<Course> courselist = getCourseList(); 
            
            for(int j = 0; j< CourseIDs.length;j++){
                for(int k = 0;k< courselist.size();k++){
                    if(courselist.get(k).getCourseID().equals(CourseIDs[j])){
                        clist.add(courselist.get(k));
                    }    
                }
            }
                
                studlist.add(new Student(UUID.fromString(dataRow[0]),dataRow[1],dataRow[2],
                                 Date.valueOf(dataRow[3]),Integer.parseInt(dataRow[4]),
                                 dataRow[5].charAt(0),dataRow[6],dataRow[7],clist,
                Integer.parseInt(dataRow[9])));
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return studlist;
    }
    
    public static void setStudentList(ArrayList<Student> studlist){
    
    try{
               String filePath = "./src/main/java/school_management_system/files/Student.txt";
               File file = new File(filePath);
               
               //If the file doesn't exist create one
               if(!file.exists()){
                   file.createNewFile();
               }
               
               FileWriter fw = new FileWriter(file.getAbsoluteFile());
               BufferedWriter bw = new BufferedWriter(fw);
               
     
               for(int i = 0; i < studlist.size(); i++){
                   
                   
                   ArrayList<Course> clist = studlist.get(i).getStdCourses();
                           
                   
                   bw.write(studlist.get(i).getUUID().toString());
                   bw.write("=");
                   bw.write(studlist.get(i).getUsername());
                   bw.write("=");
                   bw.write(studlist.get(i).getPass());
                   bw.write("=");
                   bw.write(studlist.get(i).getBDay().toString());
                   bw.write("=");
                   bw.write(Integer.toString(studlist.get(i).getStd()));
                   bw.write("=");
                   bw.write(String.valueOf(studlist.get(i).getSex()));
                   bw.write("=");
                   bw.write(studlist.get(i).getAddress());
                   bw.write("=");
                   bw.write(studlist.get(i).getEmail());
                   bw.write("=");
                   for(int l = 0;l < clist.size();l++){
                       bw.write(clist.get(l).getCourseID());
                       bw.write(",");
                   }
                   bw.write("=");
                   bw.write(Integer.toString(studlist.get(i).getAttendence()));
                   bw.write("=");
                    
                   //break line at the end 
                   bw.write("\n");
               }
               bw.close(); 
               fw.close();
               
               }catch(Exception ex){
                   ex.printStackTrace();
               }
           }
    
    public static ArrayList<Teacher> getTeacherList(){
        ArrayList<Teacher> tlist = new ArrayList<>();
        String filePath = "./src/main/java/school_management_system/files/Teacher.txt";
        File file = new File(filePath);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            Object[] lines = br.lines().toArray();

            for(int i = 0; i < lines.length; i++)
            {
                String line = lines[i].toString().trim();
                String[] dataRow = line.split("=");  
            
            String   stdlist = dataRow[8];
            ArrayList<Integer> stdnolist = getStdNo(stdlist.split(","));
            
            String courseID = dataRow[7];
            ArrayList<Course> courselist = getCourseList();
            Course course = null;
            
            for(int k = 0;k < courselist.size();k++){
                if(courselist.get(k).getCourseID().equals(courseID)){
                    course = courselist.get(k);
                }    
            }
                
                tlist.add(new Teacher(UUID.fromString(dataRow[0]),dataRow[1],dataRow[2],
                                      Date.valueOf(dataRow[3]),dataRow[4].charAt(0),
                                      dataRow[5],dataRow[6],course,stdnolist,
                                      Double.parseDouble(dataRow[9])));
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return tlist;
    }
    
    public static void setTeacherList(ArrayList<Teacher> tlist){
    
    try{
               String filePath = "./src/main/java/school_management_system/files/Teacher.txt";
               File file = new File(filePath);
               
               //If the file doesn't exist create one
               if(!file.exists()){
                   file.createNewFile();
               }
               
               FileWriter fw = new FileWriter(file.getAbsoluteFile());
               BufferedWriter bw = new BufferedWriter(fw);
               
     
               for(int i = 0; i < tlist.size(); i++){
                   
                   ArrayList<Integer> stdnolist = tlist.get(i).getStdList();
                   
                   bw.write(tlist.get(i).getUUID().toString());
                   bw.write("=");
                   bw.write(tlist.get(i).getUsername());
                   bw.write("=");
                   bw.write(tlist.get(i).getPass());
                   bw.write("=");
                   bw.write(tlist.get(i).getBDay().toString());
                   bw.write("=");
                   bw.write(String.valueOf(tlist.get(i).getSex()));
                   bw.write("=");
                   bw.write(tlist.get(i).getAddress());
                   bw.write("=");
                   bw.write(tlist.get(i).getEmail());
                   bw.write("=");
                   bw.write(tlist.get(i).getCourse().getCourseID());
                   bw.write("=");
                   for(int l = 0;l < stdnolist.size();l++){
                       bw.write(convertStd(stdnolist.get(l)));
                       bw.write(",");
                   }
                   bw.write("=");
                   bw.write(Double.toString(tlist.get(i).getSalary()));
                   bw.write("=");
                    
                   //break line at the end 
                   bw.write("\n");
               }
               bw.close(); 
               fw.close();
               
               }catch(Exception ex){
                   ex.printStackTrace();
               }
           }
}
