/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_management_system;

import java.io.*;
import java.util.*;

/**
 *
 * @author Akul
 */
public class HashMapHandler {

    public static void saveToFile(HashMap<String,ArrayList<String>> map,String filepath){
        // new file object
        File file = new File(filepath);
        
        BufferedWriter bf = null;
  
        try {
  
            // create new BufferedWriter for the output file
             bf= new BufferedWriter(new FileWriter(file));
  
            // iterate map entries
            for (Map.Entry<String, ArrayList<String>> entry :
                 map.entrySet()) {
  
                // put key and value separated by a colon
                bf.write(entry.getKey() + ":");
                for(String e : entry.getValue()){
                    bf.write(e + ";");
                }
  
                // new line
                bf.newLine();
            }
  
            bf.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
  
            try {
  
                // always close the writer
                bf.close();
            }
            catch (Exception e) {
            }
        }
    }

    public static HashMap<String,ArrayList<String>> getfromFile(String filepath){
    
    HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
    BufferedReader br = null;
  
        try {
  
            // create file object
            File file = new File(filepath);
            
            file.createNewFile();
            
            // create BufferedReader object from the File
            br = new BufferedReader(new FileReader(file));
  
            String line = null;
  
            // read file line by line
            while ((line = br.readLine()) != null) {
  
                // split the line by :
                String[] parts = line.split(":");
  
                // first part is the key, second is list of attributes
                String key = parts[0].trim();
                String list = parts[1].trim();
                
                //Split the attributes and store them in an ArrayList
                String[] elem = list.split(";");
                
                ArrayList<String> attrib = new ArrayList<>();
                
                for(int i = 0;i< elem.length;i++){
                    attrib.add(elem[i]);
                }
                
                // put entries in Hashmap if not empty
                if (!key.equals("") && !attrib.isEmpty())
                    map.put(key, attrib);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
  
            // Always close the BufferedReader
            if (br != null) {
                try {
                    br.close();
                }
                catch (Exception e) {
                };
            }
        }
  
        return map;
    }
}
