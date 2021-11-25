/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_management_system;

import java.util.*;

/**
 *
 * @author Arya veer and Ruchika
 */
public class Authorization {
    
    public static boolean checkUserPass(String userType,String uniqueID,String password){
        
        switch(userType){
            case "Student": 
                HashMap<String,ArrayList<String>> map= Student.getStudList();
                if(map.containsKey(uniqueID)){
                    return map.get(uniqueID).get(1).equals(password);
                }
            case "Admin": 
                return uniqueID.equals("admin") && password.equals("admin");
                
            case "Teacher": 
                HashMap<String,ArrayList<String>> tmap = Teacher.getTeacherList();
                if(tmap.containsKey(uniqueID)){
                    return tmap.get(uniqueID).get(1).equals(password);
                }        
        }
        return false;
    }
}
