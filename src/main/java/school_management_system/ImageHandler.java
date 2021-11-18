/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_management_system;

import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author Akul
 */
public class ImageHandler {
    
    
    public static int getImg(String filedir,String uuid,JLabel L){
        int x = 0;
        File folder = new File(filedir); //directory
          
        try {
              
            File[] listOfFiles = folder.listFiles(); //lists all the files
              
              for (File file : listOfFiles){
                  if (file.isFile()){
                      
                    String[] filename = file.getName().split("\\.(?=[^\\.]+$)"); //split filename from it's extension
                    
                    if(filename[0].equalsIgnoreCase(uuid)){ //matching defined filename
                        L.setIcon(new ImageIcon(ImageIO.read(file)));
                        System.out.println("Success");
                        x = 1;
                        return x;
                    }
                }
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }
        return x;
    }    


public static void delImg(String filedir,String uuid){
        
        File folder = new File(filedir); //directory
        
        File[] listOfFiles = folder.listFiles(); //lists all the files
        
        for (File file : listOfFiles){
            if (file.isFile()){
                
                String[] filename = file.getName().split("\\.(?=[^\\.]+$)"); //split filename from it's extension
                
                if(filename[0].equalsIgnoreCase(uuid)){ //matching defined filename
                    file.delete();
                    System.out.println("Deleted");
                }
            }
        }
    }   
}   
